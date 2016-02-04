import java.util.ArrayList;
import java.util.List;

/**
 * Created by abhiramk on 02/02/16.
 */
class Entity1 {
    private String one;
    private String two;

    public String getOne() {
        return one;
    }

    public void setOne(String one) {
        this.one = one;
    }

    public String getTwo() {
        return two;
    }

    public void setTwo(String two) {
        this.two = two;
    }
}
public class CollTest {
    public static void main(String[] args) {
        Entity1 e = new Entity1();
        e.setOne("1");
        e.setTwo("2");

        Entity1 e2 = new Entity1();
        e2.setOne("1");
        e2.setTwo("2");

        Entity1 e3 = new Entity1();
        e3.setOne("3");
        e3.setTwo("4");

        List<Entity1> entity1List = new ArrayList<Entity1>();
        entity1List.add(e);
        entity1List.add(e2);
        entity1List.add(e3);

        List<Entity1> subset = new ArrayList<Entity1>();
        subset.add(e);
        subset.add(e2);

        entity1List.removeAll(subset);

        for(Entity1 k: entity1List) {
            System.out.println(k.getOne());
        }


    }

}
