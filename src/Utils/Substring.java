package Utils;

/**
 * Created with IntelliJ IDEA.
 * User: abhiramk
 * Date: 25/06/13
 * Time: 11:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class Substring {

    public static void main(String[] args) {
        int p = 2;
        String a = "acgtgca";
        int changes = 0;
        char[] arr = a.toCharArray();
        int L = a.length();
        for(int i = 0; i<= L-p-1; i++) {
            if(arr[i] != arr[i+p]) {
                arr[i+p] = arr[i];
                changes++;
            }
        }
        System.out.println(changes);
    }

}
