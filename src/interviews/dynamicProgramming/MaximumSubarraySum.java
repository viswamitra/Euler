package interviews.dynamicProgramming;

/**
 * Created by abhiramk on 26/05/14.
 * Given an array containing atleast one positive integer,
 * find the max sum in a continuous subarray.
 * This is also known as Kadane's algorithm.
 */
public class MaximumSubarraySum {

    public static int max(int a, int b) {
        return (a>=b?a:b);
    }
    public static int maxSubArray(int[] a) {
        int currentMax = a[0], maxSoFar = a[0];
        for(int i =0; i < a.length; i++) {
            currentMax = max(a[i], currentMax + a[i]);
            maxSoFar = max(currentMax, maxSoFar);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] a = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(MaximumSubarraySum.maxSubArray(a));
    }

}
