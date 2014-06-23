package interviews.arrays;

/**
 * Created by abhiramk on 16/06/14.
 * given [a1,a2,a3,a4,b1,b2,b3,b4]
 * swap the elements inplace so that result is
 * [a1,b1,a2,b2,a3,b3,a4,b4]
 */
public class SwapElements {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,10,11,12,13};
        interleave(a);
    }

    private static void interleave(int[] a) {
        int n = a.length/2;
        for (int i = 1; i < n; i++) { // my step no.
            for (int j = 0; j < i; j++) { // no. of swaps
                int ab = n-i+2*j;
                int b = n-i+2*j+1;
                System.out.print(ab + " -- " + b);

            }
            System.out.println();
        }
    }


}
