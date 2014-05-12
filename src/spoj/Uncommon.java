package spoj;

import codechef.MaxDiff;

import java.util.Arrays;

/**
 * User: abhiramk
 * Date: 19/09/13
 * Time: 10:02 AM
 * This file is the one this project deserves, but not the one it needs
 */

public class Uncommon {

    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {2,5,6,7};



        Arrays.sort(a);
        Arrays.sort(b);

        int i =0, j = 0;
        while (i< a.length && j< b.length ) {
            if(a[i] < b[j]) {
                System.out.println(a[i]);
                i++;
            }else if (b[j] < a[i]) {
                System.out.println(b[j]);
                j++;
            }else if (a[i] == b[j]) {
                i++;
                j++;
            }
        }

        if(i< a.length) {
            for(;i< a.length; i++) {
                System.out.println(a[i]);
            }
        }

        if(j< b.length) {
            for(;j< b.length; j++) {
                System.out.println(b[j]);
            }
        }
    }
}
