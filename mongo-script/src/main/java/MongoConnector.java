import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.io.IOException;
import java.util.*;

import static com.mongodb.client.model.Aggregates.match;
import static com.mongodb.client.model.Aggregates.unwind;
import static com.mongodb.client.model.Filters.*;

/**
 * Created by abhiramk on 28/01/16.
 */
public class MongoConnector {

    private Date lte;
    private Date gte;

    public MongoConnector(Date gte, Date lte) {
        this.gte = gte;
        this.lte = lte;
    }

    public List<AEEntity> getData() {
        MongoClient mongoClient = new MongoClient("10.33.241.15", 27300);
        MongoDatabase database = mongoClient.getDatabase("raw");

        MongoCollection<Document> collection = database.getCollection("order_workflow");

        AggregateIterable<Document> iterable = collection.aggregate(Arrays.asList(
                match(
                        and(
                                gte("order_created_at", gte),
                                lte("order_created_at", lte)
                        )
//                        Filters.eq("_id", "OD204844178652280000")

                ),
                unwind(
                        "$order_item"
                ),
                unwind(
                        "$order_item.order_item_unit"
                )
        ));

        final int[] i = {0};

        final ObjectMapper objectMapper = new ObjectMapper();
        final List<AEEntity> entityList = new ArrayList<>();
        iterable.forEach(new Block<Document>() {
            public void apply(final Document document) {
                i[0]++;
                String response = document.toJson();

                try {
                    JsonNode root = objectMapper.readTree(response);
                    AEEntity entity = new AEEntity();
                    String orderId = root.get("_id").asText();
                    String orderItemId = root.get("order_item").get("order_item_id").asText();
                    String orderItemUnitStatus = root.get("order_item").get("order_item_unit").get("status").asText().toLowerCase();
                    entity.setOrderId(orderId);
                    entity.setOrderItemId(orderItemId);
                    entity.setOrderItemStatus(orderItemUnitStatus);

                    entityList.add(entity);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        });
        return entityList;
    }

    public Map<String,String> getDataMap(List<AEEntity> aeEntities) {
        Map<String, String> dataMap = new HashMap<>();

        for(AEEntity entity : aeEntities) {
            String entityAppended = entity.getOrderId()+""+entity.getOrderItemId()+""+entity.getOrderItemStatus();
            dataMap.put(entity.getOrderItemId(), entityAppended);
        }
        return dataMap;
    }


}
