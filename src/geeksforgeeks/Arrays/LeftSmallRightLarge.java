package geeksforgeeks.Arrays;

import java.util.Scanner;

/**
 * https://practice.geeksforgeeks.org/problems/unsorted-array/0
 */

public class LeftSmallRightLarge {

  public static void main(String[] args) {
    Scanner sin = new Scanner(System.in);
    int cases = Integer.parseInt(sin.nextLine());
    for(int i = 0; i < cases; i ++) {
      int len = Integer.parseInt(sin.nextLine());
      String[] split = sin.nextLine().split(" ");
      int[] split_i = modify(split);
      boolean result = false;
      for(int j = 1; j < split_i.length-1; j++) {
        if(split_i[j-1] <= split_i[j] && split_i[j] <= split_i[j+1]) {
          System.out.println(split_i[j]);
          result = true;
          break;
        }
      }
      if(!result) {
        System.out.println(-1);
      }

    }
  }

  private static int[] modify(String[] split) {
    int[] re = new int[split.length];
    for(int i = 0; i < split.length; i++) {
      re[i] = Integer.parseInt(split[i]);
    }
    return re;
  }

}
