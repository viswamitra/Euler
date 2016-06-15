package geeksforgeeks.recursion;

/**
 * Created by abhiramk on 15/06/16.
 */
public class CountK {

    public static void main(String[] args) {
        char set1[] = {'a', 'b'};
        int k = 3;
        printAllKLength(set1, k);
    }

    private static void printAllKLength(char[] set1, int k) {
        int n = set1.length;
        printKRecursive(set1, "", n, k);
    }

    private static void printKRecursive(char[] set1, String prefix, int n, int k) {
        if(k==0) {
            System.out.println(prefix);
            return;
        }
        for(int i =0; i< n; ++i) {
            String newPrefix = prefix + set1[i];
            printKRecursive(set1, newPrefix, n, k-1);
        }
    }

}
