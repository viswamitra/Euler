
import kafka.consumer.Consumer;
import kafka.consumer.ConsumerConfig;
import kafka.javaapi.consumer.ConsumerConnector;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.util.Map;
import java.util.Properties;

/**
 * Created by abhiramk on 23/07/15.
 */
public class Consumer1 implements Runnable {
    ConsumerConnector connector;

    public void process() throws Exception {
        Properties props = new Properties();
        props.put("zookeeper.connect","localhost:2181");
        props.put("group.id","test-group");

        kafka.consumer.ConsumerConfig consumerConfig = new ConsumerConfig(props);
        connector = Consumer.createJavaConsumerConnector(consumerConfig);





        KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(props);
        consumer.subscribe("orders");
        while (true) {
            Map<String, ConsumerRecords<String, String>> records = consumer.poll(100);
//            for (ConsumerRecord<String, String> record : records)
//                System.out.printf("offset = %d, key = %s, value = %s", record.offset(), record.key(), record.value());
            System.out.println(records);
            System.out.println("blah");
        }
    }

    public static void main(String[] args) {
        Consumer c = new Consumer();
        new Thread(c).start();
        try {
            c.process();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {

    }
}
