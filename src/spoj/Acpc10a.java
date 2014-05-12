package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * User: abhiramk
 * Date: 21/09/13
 * Time: 5:44 PM
 * This file is the one this project deserves, but not the one it needs
 */
public class Acpc10a {

    public static void main(String[] args) throws IOException {
        BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
        int a;
        int b;
        int c;
        int d;
        while(true) {
            String[] inp = bin.readLine().split(" ");
            a = Integer.valueOf(inp[0]);
            b = Integer.valueOf(inp[1]);
            c = Integer.valueOf(inp[2]);

            if( a == 0 && b == 0 && c == 0)
                return;

            if(b-a == c-b) {
                d = c + (c-b);
                System.out.println("AP "+d);
            }else {
                d = c*(c/b);
                System.out.println("GP "+d);
            }
        }
    }
}
