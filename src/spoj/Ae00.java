package spoj;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * User: abhiramk
 * Date: 26/09/13
 * Time: 3:42 PM
 * This file is the one this project deserves, but not the one it needs
 */
public class Ae00 {

    public static void main(String[] args) throws IOException {
        BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.valueOf(bin.readLine());
        int sum=0;
        HashMap<Integer, Integer> factors;
        for(int i = 1; i<= test; i++) {
            factors = new HashMap<Integer, Integer>();
            for(int ff = 1; ff <= i/2; ff++) {
                if(i%ff == 0) {
                    factors.put(min(ff,i/ff), max(ff,i/ff));
                }
            }
            sum+= factors.size();
        }
        System.out.println(sum+1);
    }

    static int  max(int a, int b) {
        if (a>=b) return a;
        else return b;
    }

    static int min(int a, int b) {
        if (a<b) return a;
        else return b;
    }

}

