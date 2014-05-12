package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * User: abhiramk
 * Date: 21/09/13
 * Time: 2:15 PM
 * This file is the one this project deserves, but not the one it needs
 */
public class sbstr1 {

    public static void main(String[] args) throws IOException {
        BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i< 24; i++) {
            String[] inp = bin.readLine().split(" ");
            if (inp[0].matches("(?i).*"+inp[1]+".*"))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
