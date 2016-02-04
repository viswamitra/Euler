import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * Created by abhiramk on 15/09/15.
 */
public class JodaTimeTest {
    public static void main(String[] args) {

//        DateTime datetime = new DateTime(2015,07,29,20,52,32,0);
//        DateTimeFormatter formatter = DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss");
//        System.out.println(datetime.toString(formatter));

        DateTime dateTime = new DateTime();
        DateTimeFormatter formatter = DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println(dateTime.toString(formatter));
    }
}
