package hackerrank.datastructures.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/ctci-making-anagrams/problem
 */
public class MakingAnagrams {
  public static int numberNeeded(String first, String second) {
    int result = 0;

    Map<String, Integer> map1 = new HashMap<>();
    Map<String, Integer> map2 = new HashMap<>();
    String[] firstA = first.split("");
    String[] secondA = second.split("");

    for(String i : firstA) {
      if(map1.get(i) == null) {
        map1.put(i, 1);
      } else {
        int c = map1.get(i);
        map1.put(i, ++c);
      }
    }

    for(String i : secondA) {
      if(map2.get(i) == null) {
        map2.put(i, 1);
      } else {
        int c = map2.get(i);
        map2.put(i, ++c);
      }
    }


    map1.forEach((k, v) -> {
      if(map2.get(k) == null) {
        map1.put(k, 0);
      }
      else if(map2.get(k) >= v) {

      } else {
        map1.put(k, v - map2.get(k));
      }
    });

    map2.forEach((k, v) -> {
      if(map1.get(k) == null) {
        map2.put(k, 0);
      }
      else if(map1.get(k) >= v) {

      } else {
        map2.put(k, v - map1.get(k));
      }
    });

    final int[] sum = {0};
    map1.putAll(map2);

    map1.forEach((k,v) -> {
      if(v == 0) {
        sum[0]++;
      }
    });

    return sum[0];
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String a = in.next();
    String b = in.next();
    System.out.println(numberNeeded(a, b));
  }
}
