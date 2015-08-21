import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by abhiramk on 02/07/15.
 */
public class Test {

    public static void main(String[] args) throws FileNotFoundException {
        Gson gson = new Gson();
        String json = "{" +
                "  \"errorResponse\": null," +
                "  \"order\": {" +
                "    \"version\": 5" +
                "  }" +
                "}";
        
        Entity entity = gson.fromJson(json,Entity.class);
        System.out.println(entity.toString());
        System.out.printf("hello");
    }

}
