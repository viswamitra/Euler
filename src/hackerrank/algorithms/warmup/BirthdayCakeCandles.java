package hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * Created by abhiram on 27/04/17.
 */
public class BirthdayCakeCandles {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int height[] = new int[n];
    for(int height_i=0; height_i < n; height_i++){
      height[height_i] = in.nextInt();
    }

    int maxHeight = height[0];
    int maxCount = 1;

    for(int i=1; i < n; i++){
      if(height[i] == maxHeight) {
        maxCount++;
      }
      if(height[i] > maxHeight) {
        maxCount = 1;
        maxHeight = height[i];
      }
    }

    System.out.println(maxCount);


  }
}
