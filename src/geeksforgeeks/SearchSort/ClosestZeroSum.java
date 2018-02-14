package geeksforgeeks.SearchSort;

import java.util.Arrays;
import java.util.Scanner;

public class ClosestZeroSum {
  public static void main(String[] args) {
    Scanner sin = new Scanner(System.in);
    int t = Integer.parseInt(sin.nextLine());
    for(int i = 0; i < t; i++) {
      int n = Integer.parseInt(sin.nextLine());
      String a = sin.nextLine();
      String[] as = a.split(" ");
      int[] ai = new int[n];
      for(int j = 0; j < as.length; j++) {
        ai[j] = Integer.valueOf(as[j]);
      }
      int[] res = closestPair(ai);
      System.out.println(res[0]+" "+res[1]);
    }
  }

  private static int[] closestPair(int[] ai) {
    int[] res = new int[2];
    Arrays.sort(ai);
    int i = 0;
    int j = ai.length - 1;
    int sum = Integer.MIN_VALUE;
    int maxSum = Integer.MAX_VALUE;
    while(i <j) {
      sum = ai[i] + ai[j];
      if(Math.abs(sum) < Math.abs(maxSum)) {
        maxSum = sum;
        res[0] = ai[i];
        res[1] = ai[j];
      }
      if(sum < 0) {
        i++;
      } else {
        j--;
      }
    }
    return res;
  }
}
