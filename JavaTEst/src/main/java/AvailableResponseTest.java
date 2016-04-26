import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by abhiramk on 06/11/15.
 */

@Data
class Available {

    @JsonProperty("availability_responses")
    private Map<String, AvailResponse> availResponseMap;
}

@Data
class AvailResponse {

    @JsonProperty("listing_id")
    private String listingId;

    @JsonProperty("inventory_count")
    private Integer inventoryCount;

    @JsonProperty("inventory_type")
    private String inventoryType;

}

public class AvailableResponseTest {
    public static void main(String[] args) throws IOException {
//        String a = "{\"availability_responses\":{\"LSTSHVDXFJVSHZMZJT6RQHSSJ\":{\"listing_id\":\"LSTSHVDXFJVSHZMZJT6RQHSSJ\",\"inventory_count\":0,\"inventory_type\":\"oos\"},\"LSTSHVDXFJVSHZMZJT6RQHSSK\":{\"listing_id\":\"LSTSHVDXFJVSHZMZJT6RQHSSK\",\"inventory_count\":0,\"inventory_type\":\"oos\"}}}";
        ObjectMapper objectMapper = new ObjectMapper();
//        JsonNode rootNode = objectMapper.readTree(a);
//        JsonNode response = rootNode.get("availability_responses");
//        System.out.println(response.get("LSTSHVDXFJVSHZMZJT6RQHSSJ").toString());
//        Available available = objectMapper.readValue(a, Available.class);
//        System.out.println(available.toString());
        AvailResponse response = new AvailResponse();
        Available available = new Available();
        response.setListingId("listingId");
        response.setInventoryCount(10);
        response.setInventoryType("type");

        Map<String, AvailResponse> map = new HashMap<String, AvailResponse>();
        map.put("st", response);

        available.setAvailResponseMap(map);
        System.out.println(objectMapper.writeValueAsString(available));
    }
}
