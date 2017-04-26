package hackerrank.algorithms.warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by abhiram on 26/04/17.
 */
public class CompareTriplets {

  public static void main(String[] args) throws IOException {
    BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
    String[] split = bin.readLine().split(" ");
    int a0 = Integer.valueOf(split[0]);
    int a1 = Integer.valueOf(split[1]);
    int a2 = Integer.valueOf(split[2]);
    String[] split2 = bin.readLine().split(" ");
    int b0 = Integer.valueOf(split2[0]);
    int b1 = Integer.valueOf(split2[1]);
    int b2 = Integer.valueOf(split2[2]);

    int aSum = 0;
    int bSum = 0;
    int[] result = {0,0};


    if(a0 > b0) {
      aSum++;
    }
    if(a1 > b1) {
      aSum++;
    }
    if(a2 > b2) {
      aSum++;
    }

    if(a0 < b0) {
      bSum++;
    }

    if(a1 < b1) {
      bSum++;
    }

    if(a2 < b2) {
      bSum++;
    }


    if(a0 < b0 || a1 < b1 || a2 < b2) {
      bSum++;
    }
    System.out.println(aSum+" "+bSum);


  }
}
