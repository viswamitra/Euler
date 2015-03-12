package hackerrank;

import java.util.Scanner;

/**
 * Created by abhiramk on 12/03/15.
 */
public class UtopianTree {

    private static int[] result = new int[61];

    public void buildDPArray() {
        result[0] = 1;
        for(int i = 1; i<= 60; i++) {
            if ( i%2 == 0) {
                result[i] = result[i-1]+1;
            } else {
                result[i] = result[i-1]*2;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        new UtopianTree().buildDPArray();
        int t = sin.nextInt();
        for(int i = 0; i< t; i++) {
            int n = sin.nextInt();
            System.out.println(result[n]);
        }
    }
}
