package hackerrank.algorithms.warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by abhiramk on 28/09/15.
 */
public class SimpleArraySum {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Integer limit = Integer.valueOf(in.readLine());
        int[] arr = new int[limit];
        String[] s = in.readLine().split(" ");
        int sum = 0;
        for(int i =0; i< arr.length; i++) {
            sum += Integer.valueOf(s[i]);

        }

        System.out.println(sum);

    }
}
