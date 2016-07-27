package hackerrank.algorithms.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by abhiramk on 16/06/16.
 */
public class fibonacciMod {

    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        String[] inp = sin.next().split(" ");
        int first = Integer.valueOf(inp[0]);
        int second = Integer.valueOf(inp[1]);
        int n = Integer.valueOf(inp[2]);

        List<Integer> result = new ArrayList<Integer>();
        result.add(first);
        result.add(second);
        for(int i = 2; i< n; i++) {
            result.add( (result.get(i-1)*result.get(i-1)) + result.get(i-2));
        }

        for(int i : result) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
