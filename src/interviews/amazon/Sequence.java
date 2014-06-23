package interviews.amazon;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abhiramk on 08/06/14.
 * Given 5, print all values of getting 5 with lesser numbers
 * 1,1,1,1,1
 * 1,4
 * 2,3
 * 1,2,2
 * 1,1,1,2
 * 1,1,3
 */
public class Sequence {
    public static void main(String[] args) {
        int a[] = new int[6];
        printMeth(5,new ArrayList<Integer>(),1);

    }

    private static void printMeth(int num, List<Integer> list, int s) {
        if(num == 0) {
//            for(int j=0; j<len; j++) {
//                System.out.print(","+a[j]);
//            }
//            System.out.println();
//
              System.out.println(list);
              return;
        }

        for(int i = s; i<= num; i++) {
            list.add(i);
            printMeth(num-i, list, i);
            list.remove(list.size()-1);
        }
    }
}
