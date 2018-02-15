package hackerrank.datastructures.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Given an array [1,2,3,4,5] and a count [3], left rotate the array count number of times.
 * Input:
 * 5 2
 * 1 2 3 4 5
 *
 * Output:
 * 3 4 5 1 2
 */
public class LeftRotation {
  static List<Integer> leftRotation(int[] a, int d) {
    List<Integer> aList = new ArrayList<>();
    for (int i : a) aList.add(i);
    List<Integer> left = aList.subList(0, d);
    List<Integer> right = aList.subList(d, aList.size());

    Collections.reverse(left);
    Collections.reverse(right);

    List<Integer> res = new ArrayList<>();
    res.addAll(left);
    res.addAll(right);

    Collections.reverse(res);

    return res;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int d = in.nextInt();
    int[] a = new int[n];
    for(int a_i = 0; a_i < n; a_i++){
      a[a_i] = in.nextInt();
    }
    List<Integer> result = leftRotation(a, d);
    for (int i = 0; i < result.size(); i++) {
      System.out.print(result.get(i) + (i != result.size() ? " " : ""));
    }
    System.out.println("");


    in.close();
  }
}
