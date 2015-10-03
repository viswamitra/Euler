package elasticsearch;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.ImmutableSettings;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abhiramk on 29/09/15.
 */

public class ElasticSearchDriver {

    private static Client client = null;

    public ElasticSearchDriver() {
        if(client == null) {
            List<String> host = new ArrayList<String>();

            String clusterName = "fraud_engine";
            Settings
                    settings =
                    ImmutableSettings.settingsBuilder().put("cluster.name", clusterName).build();

            client = new TransportClient(settings)
                    .addTransportAddress(new InetSocketTransportAddress("flo-dexter-esl-1.nm.flipkart.com", 9300))
                    .addTransportAddress(new InetSocketTransportAddress("flo-dexter-esl-2.nm.flipkart.com", 9300))
                    .addTransportAddress(new InetSocketTransportAddress("flo-dexter-esl-3.nm.flipkart.com", 9300));
            System.out.println("initialized client");

        }
    }

    public static void main(String[] args) {
//        ElasticSearchDriver.client

    }

}
