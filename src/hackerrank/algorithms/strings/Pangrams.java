package hackerrank.algorithms.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by abhiramk on 21/10/15.
 */
public class Pangrams {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input = in.readLine();
        char[] inpA = input.toCharArray();
        boolean[] bit = new boolean[26];

        for(int i = 0; i< inpA.length; i++) {
            int val = Integer.valueOf(inpA[i]);
            if(val == 32) {
                continue;
            }
            else if (val >= 65 && val <= 90) {
                val = val + 32;
            }

            bit[val%97] = true;

        }
        boolean isPangram = true;
        for(int i =0; i < 26; i++) {
            if(!bit[i]) {
                isPangram = false;
                break;
            }
        }

        if(isPangram)
            System.out.println("pangram");
        else
            System.out.println("not pangram");


        //space = 32
        //a = 97
        //z = 122
        //A = 65

    }
}
