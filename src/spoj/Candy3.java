package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * User: abhiramk
 * Date: 24/09/13
 * Time: 4:25 PM
 * This file is the one this project deserves, but not the one it needs
 */
public class Candy3 {

    public static void main(String[] args) throws IOException {
        BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.valueOf(bin.readLine());
        BigInteger sum;

            for(int i =0; i< test; i++) {
                System.out.println();
                int num = Integer.valueOf(bin.readLine());
                sum =BigInteger.valueOf(0);
                for(int j=0; j< num; j++) {
                    sum = sum.add(BigInteger.valueOf(Long.valueOf(bin.readLine())));
                }
                BigInteger n = BigInteger.valueOf(num);
                if(sum.mod(n).compareTo(BigInteger.valueOf(0)) == 0)  {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
    }
}
