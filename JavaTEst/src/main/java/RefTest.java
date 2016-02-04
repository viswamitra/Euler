/**
 * Created by abhiramk on 28/10/15.
 */

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Data
class Model {
    private String a;
    private Boolean b;
}


public class RefTest {
    public static void main(String[] args) throws IOException {

        Model m1 = new Model();
        m1.setA("hello");
        m1.setB(true);

        Model m2 = new Model();
        m2.setA("what");
        m2.setB(false);

        Model m3 = new Model();
        m3.setA("what");
        m3.setB(null);

        Model m4 = new Model();
        m4.setA("what");
        m4.setB(true);

        List<Model> modelList = new ArrayList<Model>();

        modelList.add(m1);
        modelList.add(m2);
        modelList.add(m3);
        modelList.add(m4);

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(modelList);
        System.out.println(json);
//        StringEntity entity = new StringEntity(json);
//        System.out.println(entity);

        JsonNode arrayNode = objectMapper.readTree(json);
        if(arrayNode.isArray()) {
            for(JsonNode node: arrayNode) {
                String a = node.get("a").toString();
                Boolean b = node.get("b").asBoolean();
                System.out.println(a);
                System.out.println(b);
            }
        }
    }
}
