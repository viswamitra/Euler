import java.io.FileNotFoundException;

/**
 * Created by abhiramk on 02/07/15.
 */
public class Test {

    public static void main(String[] args) throws FileNotFoundException {
//        Gson gson = new Gson();
//        String json = "{" +
//                "  \"errorResponse\": null," +
//                "  \"order\": {" +
//                "    \"version\": 5" +
//                "  }" +
//                "}";
//
//        Entity entity = gson.fromJson(json,Entity.class);
//        System.out.println(entity.toString());
//        System.out.printf("hello");
        String s = "OD2051428941275630002514289412756300created";
        System.out.println(s.substring(36, s.length()));
        System.out.println();
        float a = 50;
        float b = 200;
        System.out.println(a/b*100);
    }

}
