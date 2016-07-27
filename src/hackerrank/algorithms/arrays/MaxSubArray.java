package hackerrank.algorithms.arrays;

/**
 * Created by abhiramk on 21/07/16.
 */
public class MaxSubArray {
    public static void main(String[] args) {
        int[] a = {-10,-20,-30,0};
        boolean allNeg = true;
        int min = Integer.MIN_VALUE;
        for(int i = 0; i <a.length; i++) {
            if(a[i] > min) {
                min = a[i];
            }
            if(a[i] > 0) {
                allNeg = false;
                break;
            }
        }
        if(allNeg)
            System.out.println(min);

    }
}
