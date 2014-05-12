package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * User: abhiramk
 * Date: 20/09/13
 * Time: 12:32 PM
 * This file is the one this project deserves, but not the one it needs
 */
public class Fenyman {

    public static void main(String[] args) throws IOException{

        BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
        int inp;
        int sum;

        while(true) {
            inp = Integer.valueOf(bin.readLine());
            sum =0;
            if(inp == 0) {
                return;
            }else {
                for(int i =0; i< inp; i++) {
                    sum += Math.pow((inp-i),2);
                }
                System.out.println(sum);
            }

        }
    }
}
