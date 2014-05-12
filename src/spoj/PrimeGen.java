package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * User: abhiramk
 * Date: 23/11/13
 * Time: 11:23 AM
 * This file is the one this project deserves, but not the one it needs
 */
public class PrimeGen {
    public static void main(String[] args) throws IOException {
        BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(bin.readLine());
        int n = 1000000000;
        boolean[] isPrime = new boolean[1000000000];
        for(int i = 2; i <= n; i++) {
            isPrime[i]= true;
        }

        for(int i=2; i*i <= n; i++) {
            if(isPrime[i]) {
                for(int j = i; i*j < n; j++){
                    isPrime[i*j]= false;
                }
            }
        }

        for (int i =0; i< test; i++) {
            String[] inp = bin.readLine().split(" ");
            int st = Integer.valueOf(inp[0]);
            int en = Integer.valueOf(inp[1]);


            for(int k =st; k <= en; k++) {
                if(isPrime[k])
                    System.out.println(k);
            }


        }


    }
}
