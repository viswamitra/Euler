package hackerrank.algorithms.warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by abhiramk on 03/10/15.
 */
public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Integer limit = Integer.valueOf(in.readLine());
        String[] numberStrings = in.readLine().split(" ");
        int negCount = 0;
        int posCount = 0;
        int zCount = 0;
        for(int i =0; i< limit; i++) {
            int val = Integer.valueOf(numberStrings[i]);
            if(val > 0)
                posCount++;
            if(val < 0)
                negCount++;
            else
                zCount++;
        }

        double posFrac = posCount/limit;
        System.out.println((double)Math.round((posFrac) * 1000d) / 1000d);
        System.out.println((double)Math.round((negCount/limit) * 1000d) / 1000d);
        System.out.println((double)Math.round((zCount/limit) * 1000d) / 1000d);
    }
}
