package interviews.arrays;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by abhiramk on 20/06/14.
 */
public class Decrypt {

    public static void main(String[] args) throws IOException {
        BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String a = bin.readLine();
            if(Integer.valueOf(a) == 0)
                break;
            System.out.println(decrypt(a));
        }
    }

    public static int decrypt(String input) {
        if(input.length() == 0) {
            return 0;
        }
        else if(input.length() == 1) {
            return 1;
        }
        else if(input.length() == 2) {
            if(Integer.parseInt(input) <= 26) {
                return 2;
            } else {
                return 1;
            }
        }
        else  {

            String rest = input.substring(1, input.length());

            String first1 = input.substring(0,2);
            String rest2 = input.substring(2, input.length());

            if(Integer.parseInt(first1) >=26) {
                return decrypt(rest);
            } else {
                return decrypt(rest) + decrypt(rest2);
            }


        }



    }

}
