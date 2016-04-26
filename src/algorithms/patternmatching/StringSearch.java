package algorithms.patternmatching;

/**
 * Created by abhiramk on 12/04/16.
 */
public class StringSearch {

    boolean bruteForce(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        for(int i = 0; i< n; i++) {
            for(int j= 0; j<m && i+j<n; j++) {
                if(text.charAt(i+j) != pattern.charAt(j))
                    break;
                if(j==m)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new StringSearch().bruteForce("ABCDE", "BC"));
    }
}
