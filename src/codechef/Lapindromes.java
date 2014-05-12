package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: abhiramk
 * Date: 08/06/13
 * Time: 12:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class Lapindromes {

        public static String isLapindrome(String ele) {
            int l = ele.length();
            String a = null;
            String b = null;
            if ( l%2 == 0 ) {
                a = ele.substring(0, l/2);
                b = ele.substring(l/2,l);
            } else {
                a = ele.substring(0,l/2);
                b = ele.substring((l+1)/2,l);
            }
            char[] aChar = a.toCharArray();
            char[] bChar = b.toCharArray();
            Arrays.sort(aChar);
            Arrays.sort(bChar);
            a = new String(aChar);
            b = new String(bChar);

            if(a.equalsIgnoreCase(b)) {
                return "YES";
            } else {
                return "NO";
            }
        }

        public static void main(String[] args) throws NumberFormatException, IOException {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(bf.readLine());
            for (int i = 0; i < n ; i++) {
                System.out.println(isLapindrome(bf.readLine()));
            }
        }
}
