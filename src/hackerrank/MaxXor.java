package hackerrank;

import java.util.Scanner;

/**
 * Created by abhiramk on 12/03/15.
 */
public class MaxXor {

    static int maxXor(int l, int r) {
        int min = 0;
        for(int i = l; i<=r; i++) {
            for (int j = l; j<=r; j++){
                int res = i^j;
                if(res > min ) {
                    min = i^j;
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());

        int _r;
        _r = Integer.parseInt(in.nextLine());

        res = maxXor(_l, _r);
        System.out.println(res);

    }
}
