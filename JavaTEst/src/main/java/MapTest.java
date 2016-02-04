import java.util.HashMap;
import java.util.Map;

/**
 * Created by abhiramk on 01/02/16.
 */
public class MapTest {

    public static void main(String[] args) {

        Map<String, String> m = new HashMap<String, String>();
        m.put("a", "1");
        m.put("a", "2");
        m.put("b", "3");
    }
}
