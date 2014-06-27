package javaTest.generics;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by abhiramk on 24/06/14.
 */
public class Model {

    private String nameKey;
    private String nameValue;

    public String getNameKey() {
        return nameKey;
    }

    public void setNameKey(String nameKey) {
        this.nameKey = nameKey;
    }

    public String getNameValue() {
        return nameValue;
    }

    public void setNameValue(String nameValue) {
        this.nameValue = nameValue;
    }

    public static void main(String[] args) {
        Model m = new Model();
        m.setNameKey("hello");
        m.setNameValue("there");
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();
        String res = gson.toJson(m);
        System.out.println(res);

    }
}



