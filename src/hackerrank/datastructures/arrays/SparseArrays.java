package hackerrank.datastructures.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by abhiramk on 15/03/16.
 */
public class SparseArrays {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int nCases = sin.nextInt();
        Map<String, Integer> bank= new HashMap<>();
        for(int i =0; i<nCases; i++) {
            String inp = sin.next();
            if(bank.get(inp)==null) {
                bank.put(inp, 1);
            } else {
                int c= bank.get(inp);
                bank.put(inp,++c);
            }
        }

        int nQueries = sin.nextInt();
        for(int j = 0; j< nQueries; j++) {
            String inp = sin.next();
            if(bank.get(inp) == null)
                System.out.println("0");
            else
                System.out.println(bank.get(inp));
        }
    }
}
