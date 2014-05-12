package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by abhiramk on 18/03/14.
 */
public class Eights {

    public static void main(String[] args) throws IOException {
        Scanner sin = new Scanner(System.in);
        int test = sin.nextInt();

        for(int i =0; i< test; i++) {
            BigInteger bi = sin.nextBigInteger();

            bi = bi.subtract(BigInteger.ONE);
            bi = bi.multiply(BigInteger.valueOf(250));
            bi = bi.add(BigInteger.valueOf(192));
            System.out.println(bi);

        }

    }
}
