package hackerrank.algorithms.dynamicprogramming;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Dynamic programming for fibonacci modified.
 */
public class fibonacciMod {

    static BigInteger fibonacciModified(int t1, int t2, int n) {
        List<BigInteger> resList = constructDP(t1, t2, n);
        return resList.get(n-1);
    }

    static List<BigInteger> constructDP(int t1, int t2, int n) {
        List<BigInteger> list = new ArrayList<BigInteger>();
        list.add(BigInteger.valueOf(Long.valueOf(t1)));
        list.add(BigInteger.valueOf(Long.valueOf(t2)));
        for(int i = 2; i < n; i++) {
            BigInteger power = list.get(i-1).pow(2);
            BigInteger toAdd = list.get(i-2);
            BigInteger res = power.add(toAdd);
            list.add(res);
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t1 = in.nextInt();
        int t2 = in.nextInt();
        int n = in.nextInt();
        BigInteger result = fibonacciModified(t1, t2, n);
        System.out.println(result);
        in.close();
    }
}
