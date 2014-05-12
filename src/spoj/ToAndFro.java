package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * User: abhiramk
 * Date: 20/09/13
 * Time: 12:16 AM
 * This file is the one this project deserves, but not the one it needs
 */
public class ToAndFro {

    public static void main(String[] args) throws IOException{

        BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
        int cols;
        int jump;
        char[] message;
        char[] result;

        int mlen;
        boolean flip;

        while(true) {
            cols = Integer.valueOf(bin.readLine());
            if(cols == 0) {
                return;
            } else {
                message = bin.readLine().toCharArray();
                result = new char[message.length];
                mlen = message.length;
                jump = mlen/cols;
                int init = 0;
                flip = true;
                for(int i = 0; i< mlen; i++) {
                    result[init] = message[i];
                    if((i+1) % cols == 0 ) {
                        init++;
                        flip = !flip;
                        continue;
                    }
                    if(flip) {
                        init+=jump;
                    }else {
                        init-=jump;
                    }
                }
            }
            System.out.println(String.valueOf(result));
        }
    }
}
