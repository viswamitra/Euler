package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * User: abhiramk
 * Date: 19/09/13
 * Time: 11:49 PM
 * This file is the one this project deserves, but not the one it needs
 */
public class nsteps {

    public static void main(String[] args) throws IOException{
        BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.valueOf(bin.readLine());

        for(int i=0; i< cases; i++) {
            String[] a = bin.readLine().split(" ");
            int f1 = Integer.valueOf(a[0]);
            int f2 = Integer.valueOf(a[1]);

            if(f2 > f1 || (f1-f2 > 2) || f1-f2 == 1) {
                System.out.println("No Number");
            }else if( f2 % 2 == 0 && f1 % 2 == 0) {
                System.out.println(f1+f2);
            }else {
                System.out.println((f1+f2)-1);
            }
        }
    }
}
