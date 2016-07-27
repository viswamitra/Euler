package hackerrank.algorithms.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by abhiramk on 26/07/16.
 */
public class Intro {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int val = Integer.valueOf(in.readLine());
        int siz = Integer.valueOf(in.readLine());
        String[] num = in.readLine().split(" ");
        for(int i = 0; i< num.length;i++) {
            int arr = Integer.valueOf(num[i]);
            if(arr == val)
                System.out.println(i);
        }

    }
}
