package hackerrank;

import java.util.Scanner;

/**
 * Created by abhiramk on 12/03/15.
 */
public class LoveLetters {

    static int work(String a) {
        int size = a.length();
        String first = null;
        String second = null;
        first = a.substring(0, size/2);
        first = reverse(first);
        if(size %2 == 0) {
            second = a.substring(size/2, a.length());
        } else {
            second = a.substring((size/2)+1, a.length());
        }
        int res = divide(first, second);
        return res;

    }

    private static int divide(String first, String second) {
        char[] firstChar = first.toCharArray();
        char[] secondChar = second.toCharArray();
        int sum = 0;
        for(int i = 0; i< firstChar.length; i++) {
            sum += modulus(firstChar[i], secondChar[i]);
        }
        return sum;
    }

    private static int modulus(char c, char c1) {
        int one = (int)c;
        int two = (int)c1;
        int result = one - two;
        if(result < 0) {
            result *= -1;
        }else {
            result *= 1;
        }
        return result;
    }

    private static String reverse(String first) {
        return null;
    }


    public static void main(String[] main) {
        Scanner sin = new Scanner(System.in);
        int t = sin.nextInt();
        for(int i =0; i< t; i++) {
            String a = sin.next();
            char[] b = a.toCharArray();
            System.out.println((int) b[0]);
            System.out.println((int) b[1]);

        }
    }
}
