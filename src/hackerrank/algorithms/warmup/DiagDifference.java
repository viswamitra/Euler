package hackerrank.algorithms.warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by abhiramk on 03/10/15.
 */
public class DiagDifference {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Integer limit = Integer.valueOf(in.readLine());
        int[][] matrix = new int[limit][limit];

        for(int i=0; i< limit; i++) {
            String[] input = in.readLine().split(" ");
            for(int j=0; j< input.length; j++) {
                matrix[i][j] = Integer.valueOf(input[j]);
            }
        }

        int sum1 = 0; int sum2=0;
        for(int i =0; i< limit; i++) {
            sum1 += matrix[i][i];
            sum2 += matrix[limit-i-1][i];
        }

        System.out.println(Math.abs(sum1-sum2));


    }
}
