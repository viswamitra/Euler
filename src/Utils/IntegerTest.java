package Utils;

/**
 * Created with IntelliJ IDEA.
 * User: abhiramk
 * Date: 18/06/13
 * Time: 7:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class IntegerTest {

    private static String sanitizeString(String inputString) {
        if (inputString != null) {
            return inputString.replaceAll("[\",';&#\n\\\\]", "");
        } else {
            return inputString;
        }
    }

    public static void main(String[] args) {
//        Double individualItemPrice = Double.parseDouble(sanitizeString(price)) / Integer.getInteger(quantity);
//        shipmentItem.setPrice(individualItemPrice);
        int i = 0;
        int j = 0;
        do {
            i++;
            System.out.println("this will print once atleast");
        } while (i < j);

    }
}
