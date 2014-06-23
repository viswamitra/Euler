package interviews.arrays;

/**
 * Created by abhiramk on 31/05/14.
 */
public class Print2DPath {

    public static void main(String[] args) {
        int m = 5;
        int n = 5;
        printPaths(m,n, 0, 0);

    }

    private static void printPaths(int m, int n, int i, int j) {
        System.out.println(i+"-"+j);
        if(i == 5 || j == 5) {
            return;
        }
        printPaths(m, n, i+1, j);
        System.out.println("-------");
        printPaths(m, n, i, j+1);
        System.out.println("-------");

    }
}
