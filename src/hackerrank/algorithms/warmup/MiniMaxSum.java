package hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * Integer Overflow problem
 * Created by abhiram on 27/04/17.
 */
public class MiniMaxSum {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    long a = in.nextLong();
    long b = in.nextLong();
    long c = in.nextLong();
    long d = in.nextLong();
    long e = in.nextLong();
    long[] longs = new long[] {a, b, c, d, e};

    long totalSum = a + b + c + d + e;
    long min = totalSum - longs[0];
    long max = totalSum - longs[0];

    for(int i = 0; i < longs.length; i++) {
      long sum = totalSum - longs[i];
      if(sum < min) {
        min = sum;
      }
      if(sum > max) {
        max = sum;
      }
    }

    System.out.println(min+" "+max);

  }
}
