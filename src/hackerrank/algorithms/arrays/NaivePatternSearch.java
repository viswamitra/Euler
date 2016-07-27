package hackerrank.algorithms.arrays;

/**
 * Created by abhiramk on 15/07/16.
 */
public class NaivePatternSearch {
    public static void main(String[] args) {
        String a = "abhiram";
        String b = "ira";

        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();

        int n = a.length();
        int m = b.length();

        for(int i = 0; i<= n-m; i++) {
            for(int j = 0; j<m; j++) {
                if(b1[j] != a1[i+j])
                    break;
            }
        }
    }
}
