package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * User: abhiramk
 * Date: 20/09/13
 * Time: 11:53 PM
 * This file is the one this project deserves, but not the one it needs
 */
public class Julka {

    public static void main(String[] args) throws IOException {
        BigInteger two = new BigInteger(String.valueOf(2));
        BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
//        klaudia has more apples
//                natalia has less apples
       for(int i =0; i< 10; i++) {
           BigInteger total = new BigInteger(bin.readLine());
           BigInteger extra = new BigInteger(bin.readLine());
           BigInteger natalia = total.subtract(extra).divide(two);
           System.out.println(natalia.add(extra));
           System.out.println(natalia);

       }
    }
}
