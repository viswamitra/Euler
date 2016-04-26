package hackerrank.algorithms.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by abhiramk on 20/04/16.
 */
public class GemStones {

    public static void main(String[] args) throws IOException {
        BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
        int[] countArray = new int[26];
        int limit = Integer.parseInt(bin.readLine());
        for(int i =0; i< limit; i++) {
            char[] line = bin.readLine().toCharArray();
            for(int j = 0; j< line.length; j++) {
                int idx = Character.getNumericValue(line[j]) - 10;
                if(countArray[idx] == i)
                    countArray[idx]++;
            }
        }
        int ans = 0;
        for(int i = 0; i< countArray.length; i++) {
            if(countArray[i] == limit)
                ans++;
        }
        System.out.println(ans);

    }
}
