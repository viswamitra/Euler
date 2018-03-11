package interviews.arrays;

import java.util.ArrayList;
import java.util.List;

public class Duplicate {

  public int repeatedNumber(final List<Integer> a) {
    for(int i = 0; i < a.size(); i++) {
      int jump = a.get(a.get(i)-1);
      if (jump > 0) {
        a.set(a.get(i)-1, -jump);

      } else {
        return a.get(i);
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    List<Integer> li = new ArrayList<>();
    li.add(1);
    li.add(1);
    li.add(2);

    Duplicate d = new Duplicate();
    d.repeatedNumber(li);
  }
}
