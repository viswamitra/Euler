package hackerrank.algorithms.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by abhiramk on 19/04/16.
 */
public class AlternatingCharacters {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Integer limit = Integer.valueOf(in.readLine());
        for(int i = 0; i< limit; i++) {
            String a = in.readLine();
            char[] aChar = a.toCharArray();
            minNumbers(aChar);
        }

    }

    private static void minNumbers(char[] aChar) {
        int count = 0;
        for(int j = 0; j< aChar.length-1; j++) {
            if(aChar[j] == aChar[j+1])
                count++;
        }
        System.out.println(count);
    }
}
