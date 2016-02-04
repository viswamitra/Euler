import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by abhiramk on 05/11/15.
 */
public class GetTest {

    public static void main(String[] args) throws URISyntaxException, IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        ObjectMapper objectMapper = new ObjectMapper();


        URIBuilder builder = new URIBuilder()
                .setScheme("http")
                .setHost("10.47.1.8")
                .setPort(31200)
                .setPath("/views")
                .setParameter("entityIds", "LSTACCEA5E3GPBQJ9P9JORNUY")
                .setParameter("viewNames", "order_details");





        URI uri = builder.build();

        HttpGet httpGet = new HttpGet(uri);

        httpGet.addHeader("z-clientId","w3.cart");
        httpGet.addHeader("z-timestamp","18-11-2015 15:36:08");
        httpGet.addHeader("z-requestId",Long.toString(System.currentTimeMillis()));
        System.out.println(httpGet.getURI());
        //execute httpGet with this uri;
        HttpResponse response = httpClient.execute(httpGet);
        String finalResponse = EntityUtils.toString(response.getEntity());
        System.out.println(finalResponse);
        JsonNode rootNode = objectMapper.readTree(finalResponse);
        System.out.println(rootNode.get("entityViews"));
        System.out.println(rootNode.get("entityViews").get(0).get("view").get("listing"));
        System.out.println(rootNode.get("entityViews").get(0).get("view").get("listing").get("international"));

    }
}
