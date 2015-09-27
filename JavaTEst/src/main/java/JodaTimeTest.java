import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * Created by abhiramk on 15/09/15.
 */
public class JodaTimeTest {
    public static void main(String[] args) {
        long time = 144222360553200l;
        DateTime datetime = new DateTime(time);
        DateTimeFormatter formatter = DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println(datetime.toString(formatter));
    }
}
