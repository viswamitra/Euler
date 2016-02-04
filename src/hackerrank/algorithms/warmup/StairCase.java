package hackerrank.algorithms.warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by abhiramk on 03/10/15.
 */
public class StairCase {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int height = Integer.valueOf(in.readLine());
        char[][] steps = new char[height][height];
        for(int i =0; i< height; i++){
            for (int j =0; j< height; j++) {
                steps[i][j] = ' ';
            }
        }

        for(int i = 0; i < height; i++) {
            for(int j = height-1; j >= height-1-i; j--) {
                steps[i][j] = '#';
            }
        }

        for(int i =0; i< height; i++){
            for (int j =0; j< height; j++) {
                System.out.print(steps[i][j]);
            }
            System.out.println();
        }



    }
}
