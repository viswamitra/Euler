/**
 * Created by abhiramk on 01/02/16.
 */
public class OMSEntity {

    private String orderId;
    private String orderItemId;

    @Override
    public String toString() {
        return "OMSEntity{" +
                "orderId='" + orderId + '\'' +
                ", orderItemId='" + orderItemId + '\'' +
                ", orderItemStatus='" + orderItemStatus + '\'' +
                ", customerCancellation=" + customerCancellation +
                '}';
    }

    private String orderItemStatus;
    private boolean customerCancellation;

    public boolean isCustomerCancellation() {
        return customerCancellation;
    }

    public void setCustomerCancellation(boolean customerCancellation) {
        this.customerCancellation = customerCancellation;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    public String getOrderItemStatus() {
        return orderItemStatus;
    }

    public void setOrderItemStatus(String orderItemStatus) {
        this.orderItemStatus = orderItemStatus;
    }
}
