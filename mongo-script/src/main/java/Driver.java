import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by abhiramk on 01/02/16.
 */
public class Driver {



    public static void main(String[] args) {
        long ONE_MIN = 60000;
        Calendar date = Calendar.getInstance();
        long da = date.getTimeInMillis();
        int lag = Integer.valueOf(args[0]);
        int interval = Integer.valueOf(args[1]);

        Date gte = new Date(da - lag*ONE_MIN);
        Date lte = new Date(da - lag*ONE_MIN + interval*ONE_MIN);

        System.out.println(gte.toString());
        System.out.println(lte.toString());

        MongoConnector mongoConnector = new MongoConnector(gte, lte);
        List<AEEntity> aeEntities = mongoConnector.getData();
        Map<String, String> dataMap = mongoConnector.getDataMap(aeEntities);

        MysqlConnector mysqlConnector = new MysqlConnector(gte, lte);
        List<OMSEntity> omsEntities = mysqlConnector.getData();
        Map<String, String> omsDataMap = mysqlConnector.getDataMap(omsEntities);
        Map<String, Boolean> omsCancelledMap = mysqlConnector.cancelledDataMap(omsEntities);


        Driver driver = new Driver();
        driver.writeToFile(dataMap, omsDataMap, omsCancelledMap, gte, lte);
//        driver.writeToFile(dataMap, omsDataMap, gte, lte);


    }

    private void writeToFile(Map<String, String> dataMap, Map<String, String> omsDataMap,
                             Map<String, Boolean> omsCancelledMap, Date gte, Date lte) {
        SimpleDateFormat format = new SimpleDateFormat("MMdd_HH:mm:ss");
        String lteS = format.format(lte);
        String gteS = format.format(gte);
        PrintWriter writer = null;
        int onlyInAE = 0;
        int AEOMSDiff = 0;
        int onlyinOMS = 0;
        int OMSAEDiff = 0;
        try {
            writer = new PrintWriter("ad_"+gteS+"--"+lteS, "UTF-8");
            for(String key : dataMap.keySet()) {
                //if key is not there, then print to the file, saying its there in AE but not in OMS

                if(!omsDataMap.containsKey(key)) {
                    onlyInAE++;
                    writer.println(dataMap.get(key)+","+"--");
                // if key is there, and the value is not the same, then print both side by side.
                } else {
                    if(dataMap.get(key).compareToIgnoreCase(omsDataMap.get(key)) != 0) {
                        String aeValue = dataMap.get(key);
                        String omsValue  = omsDataMap.get(key);
                        if(aeValue.substring(36, aeValue.length()).equalsIgnoreCase("approved")) {
                            System.out.println("Approved aeValue : "+aeValue);
                            if ( omsValue.substring(36, omsValue.length()).equalsIgnoreCase("delivered") ||
                                    omsValue.substring(36, omsValue.length()).equalsIgnoreCase("dispatched") ||
                                    omsValue.substring(36, omsValue.length()).equalsIgnoreCase("ready_to_ship") ||
                                    omsValue.substring(36, omsValue.length()).equalsIgnoreCase("created") ||
                                    omsValue.substring(36, omsValue.length()).equalsIgnoreCase("shipped")

                                    ) {
                                System.out.println("delivered|dispatched|readytoship omsValue : "+omsValue);
                                continue;
                            }

                            if( (
                                    omsValue.substring(36, omsValue.length()).equalsIgnoreCase("cancelled") ||
                                    omsValue.substring(36, omsValue.length()).equalsIgnoreCase("on_hold") )
                                                    &&
                                    omsCancelledMap.get(key)) {
                                System.out.println("cancelled-user requested omsValue "+omsValue);
                                continue;
                            }
                        }
                        if( omsValue.substring(36, omsValue.length()).equalsIgnoreCase("created")
                                ) {
                            System.out.println("created value "+omsValue);
                            continue;
                        }
                        AEOMSDiff++;
                        writer.println(dataMap.get(key)+","+omsDataMap.get(key));
                    } else {
                        continue;
                    }
                }
            }
            writer.println("------,------");
            for(String key : omsDataMap.keySet()) {
                //if key is not there, then print to the file, saying its there in AE but not in OMS
                if(!dataMap.containsKey(key)) {
                    System.out.println(omsDataMap.get(key));
                    if(omsDataMap.get(key).substring(36, omsDataMap.get(key).length()).equalsIgnoreCase("created"))
                        continue;
                    onlyinOMS++;
                    writer.println("--" + "," + omsDataMap.get(key));
                    // if key is there, and the value is not the same, then print both side by side.
                } else {
//                    if(omsDataMap.get(key).compareToIgnoreCase(dataMap.get(key)) != 0) {
//                        OMSAEDiff++;
//                        writer.println(dataMap.get(key)+","+omsDataMap.get(key));
//                    } else {
//                        continue;
//                    }
                    continue;
                }
            }
            writer.println("------,------");
            writer.println("Total in AE,"+dataMap.size());
            writer.println("Total in OMS," + omsDataMap.size());
            writer.println("In AE not in OMS,"+onlyInAE);
            writer.println("In OMS not in AE,"+onlyinOMS);
            writer.println("AE<->OMS Diff,"+AEOMSDiff);
            float size = dataMap.size();
            float diff = AEOMSDiff;
            writer.println("Diff %,"+ Double.valueOf(diff/size*100));




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } finally {
            writer.close();
        }
    }
}
