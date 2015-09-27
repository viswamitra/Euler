package hackerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by abhiramk on 24/08/15.
 */
public class FindDigits {

    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int limit = sin.nextInt();

        for (int i = 0; i < limit; i++) {
            long num = sin.nextLong();
            long[] a = new long[11];
            for(int j = 0; j < 11; j++) {
                a[j] = num % 10;
                num = num / 10;
            }
            int count = 0;
            for (int j = 0; j < 11; j++) {
                if(a[j] == 0)
                    continue;
                if ((num % a[j]) == 0)
                    count++;
            }
            System.out.println(count);
        }
    }

}
