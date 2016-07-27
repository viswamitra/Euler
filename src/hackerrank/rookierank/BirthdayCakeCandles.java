package hackerrank.rookierank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by abhiramk on 26/07/16.
 */
public class BirthdayCakeCandles {
    public static void main(String[] args) throws IOException {
        BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.valueOf(bin.readLine());
        String[] arr = bin.readLine().split(" ");
        int max = Integer.valueOf(arr[0]);
        int c = 0;
        for(int i =0; i< size; i++) {
            int v = Integer.valueOf(arr[i]);
            if(v == max)
                c++;
            if(v > max) {
                max = v;
            }
        }
        System.out.println(c);
    }

}
