import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

/**
 * Created by abhiramk on 01/02/16.
 */
public class MysqlConnector {

    private Date gte;
    private Date lte;

    public MysqlConnector(Date gte, Date lte) {
        this.gte = gte;
        this.lte = lte;
    }

    public List<OMSEntity> getData() {
        String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        String DB_URL = "jdbc:mysql://flo-oms-b2c-db-slave.nm.flipkart.com/oms_b2c_production";

        String USER = "oms-1_ro";
        String PASS = "OVxYpp61";

        Connection conn = null;
        Statement stmt = null;

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String lteS = format.format(lte);
        String gteS = format.format(gte);

        List<OMSEntity> omsEntities = new ArrayList<>();
//        List<String> cancelledOrderItems = new ArrayList<>();
        Map<String, OMSEntity> cancelledOrderItems = new HashMap<>();



        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "select o.external_id, oi.id, oi.status from order_items oi join orders o on " +
                    "oi.order_id = o.id  where o.order_date between " +"'"+ gteS+"'"+ " and "+"'"+ lteS +"'";
            System.out.println(sql);

            ResultSet rs = stmt.executeQuery(sql);
            int cancelledItems = 0;
            while(rs.next()) {
                OMSEntity omsEntity = new OMSEntity();

                omsEntity.setOrderId(rs.getString("external_id"));
                omsEntity.setOrderItemId(rs.getString("id"));
                omsEntity.setOrderItemStatus(rs.getString("status"));
                if(rs.getString("status").equalsIgnoreCase("cancelled")) {
                    cancelledItems++;
                    cancelledOrderItems.put(rs.getString("id"), omsEntity);
                }
                omsEntities.add(omsEntity);

            }

            for(String orderItem : cancelledOrderItems.keySet()) {
                OMSEntity omsEntity = cancelledOrderItems.get(orderItem);
                System.out.println(omsEntity.toString());
                String sql2 = "select from_status from order_item_status_histories where " +
                        "order_item_id = "+"'"+orderItem+"'"+ " and from_status = 'approved' and " +
                        "to_status = 'on_hold' and change_reason = 'cancellation_requested'";
                ResultSet rs2 = stmt.executeQuery(sql2);
                    while (rs2.next()) {
                        if(rs2.getString("from_status") != null) {
                            omsEntity.setCustomerCancellation(true);
                        }
                        System.out.println(omsEntity.toString());
                    }
            }



        } catch (SQLException e) {
            e.printStackTrace();
        }

        finally{
            try{
                if(stmt!=null)
                    conn.close();
            }catch(SQLException se){
            }
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }

        return omsEntities;
    }

    public Map<String, String> getDataMap(List<OMSEntity> omsEntities) {

        Map<String, String> dataMap = new HashMap<>();

        for(OMSEntity entity : omsEntities) {
            String entityAppended = entity.getOrderId()+""+entity.getOrderItemId()+""+entity.getOrderItemStatus();
            dataMap.put(entity.getOrderItemId(), entityAppended);
        }
        return dataMap;
    }

    public Map<String, Boolean> cancelledDataMap(List<OMSEntity> omsEntities) {
        Map<String, Boolean> dataMap = new HashMap<>();

        for(OMSEntity entity : omsEntities) {
            dataMap.put(entity.getOrderItemId(), entity.isCustomerCancellation());
        }
        return dataMap;
    }


}
