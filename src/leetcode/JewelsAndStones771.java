package leetcode;

import java.util.HashMap;
import java.util.Map;

public class JewelsAndStones771 {

  public int numJewelsInStones(String J, String S) {
    Map<String, Integer> jewels = new HashMap<>();
    String[] je = J.split("");
    for(int i = 0; i < je.length; i++) {
      if(jewels.get(je[i]) == null) {
        jewels.put(je[i], 1);
      }
    }

    String[] se = S.split("");
    int result = 0;
    for(String i : se) {
      if(jewels.get(i) != null) {
        result++;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    JewelsAndStones771 jewelsAndStones771 = new JewelsAndStones771();
    int result = jewelsAndStones771.numJewelsInStones("aA", "aAAbbbb");
    System.out.println(result);
  }
}
