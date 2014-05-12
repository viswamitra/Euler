package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * User: abhiramk
 * Date: 21/09/13
 * Time: 12:46 AM
 * This file is the one this project deserves, but not the one it needs
 */
public class Fasion {

    public static void main(String[] args) throws IOException {
        BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
        int[] men;
        int[] women;
        int test = Integer.valueOf(bin.readLine());
        for(int i =0; i< test; i++) {
            int count = Integer.valueOf(bin.readLine());
                men = new int[count];
                women = new int[count];

                String[] menInput = bin.readLine().split(" ");
                String[] womenInput = bin.readLine().split(" ");

                for(int k = 0; k< menInput.length; k++) {
                    men[k] = Integer.valueOf(menInput[k]);
                }

                for(int k = 0; k< womenInput.length; k++) {
                    women[k] = Integer.valueOf(womenInput[k]);
                }

                Arrays.sort(men);
                Arrays.sort(women);
                int sum = 0;

                for(int k =0; k< count; k++) {
                    sum+=(men[k]*women[k]);
                }
                System.out.println(sum);

        }
    }
}
