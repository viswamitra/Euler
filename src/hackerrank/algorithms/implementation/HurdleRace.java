package hackerrank.algorithms.implementation;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * https://www.hackerrank.com/challenges/the-hurdle-race/problem
 */
public class HurdleRace {
  static int hurdleRace(int k, int[] height) {
    final int[] max = {0};
    IntStream.range(0, height.length).forEach(i -> {
      if(i > max[0]) {
        max[0] = i;
      }
    });
    return max[0] - k;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    int[] height = new int[n];
    for(int height_i = 0; height_i < n; height_i++){
      height[height_i] = in.nextInt();
    }
    int result = hurdleRace(k, height);
    System.out.println(result);
    in.close();
  }
}
