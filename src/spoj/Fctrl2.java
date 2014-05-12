package spoj;

import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * User: abhiramk
 * Date: 17/09/13
 * Time: 12:00 AM
 * This file is the one this project deserves, but not the one it needs
 */
public class Fctrl2 {
    public static void main(String[] args) throws IOException {

        BigInteger bi ;
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for(int i=0; i< testCases; i++) {
            bi = BigInteger.valueOf(1);
            int num = sc.nextInt();
            for(int k=1;k<=num;k++) {
                bi = bi.multiply(BigInteger.valueOf(k));
            }
            System.out.println(bi);
        }
    }
}
