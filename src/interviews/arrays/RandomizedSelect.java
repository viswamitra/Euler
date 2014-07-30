package interviews.arrays;

/**
 * Created by abhiramk on 26/07/14.
 * returns the ith statistic of a number
 */
public class RandomizedSelect {

    public static void main(String[] args) {
        int[] a = {1,3,6,5,8,2};
        sortRandomizedSelect(a);
        for(int i =0; i< a.length; i++) {
            System.out.println(a[i]);
        }
    }

    private static void sortRandomizedSelect(int[] a) {
        sortRandomSelectHelper(a, 0, a.length-1, 2);
    }

    private static void sortRandomSelectHelper(int[] a, int p, int r, int i) {
//        if (p==r)


    }
}
