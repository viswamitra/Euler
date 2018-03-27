package hackerrank.datastructures.hashtabkles;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/ctci-ransom-note/problem
 */
public class RansomNote {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int m = in.nextInt();
    int n = in.nextInt();
    String magazine[] = new String[m];
    for(int magazine_i=0; magazine_i < m; magazine_i++){
      magazine[magazine_i] = in.next();
    }
    String ransom[] = new String[n];
    for(int ransom_i=0; ransom_i < n; ransom_i++){
      ransom[ransom_i] = in.next();
    }

    Map<String, Integer> map = new HashMap<>();
    for(String i : magazine) {
      map.merge(i, 1, Integer::sum);
    }

    for(String i: ransom) {
      if(map.get(i) == null) {
        System.out.println("No");
        System.exit(1);
      }
      if(map.get(i) >=1) {
        Integer c = map.get(i);
        map.put(i, --c);
      }
      if(map.get(i) == 0) {
        map.remove(i);
      }


    }

    System.out.println("Yes");
  }
}
