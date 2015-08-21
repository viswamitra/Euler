import java.io.Serializable;

/**
 * Created by abhiramk on 02/07/15.
 */
public class Entity implements Serializable {

    private String errorResponse;
    private Order order;

    private static class Order {
        private String version;
        private String dirty;
        private String createdAt;
        private String updatedAt;
        private String externalId;

    }




}
