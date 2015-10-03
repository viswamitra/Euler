package hackerrank.algorithms.warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by abhiramk on 28/09/15.
 */
public class VeryBigSum {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Integer limit = Integer.valueOf(in.readLine());
        long[] arr = new long[limit];
        String[] s = in.readLine().split(" ");
        long sum = 0L;
        for(int i =0; i< arr.length; i++) {
            sum += Long.valueOf(s[i]);
        }

        System.out.println(sum);


    }
}
