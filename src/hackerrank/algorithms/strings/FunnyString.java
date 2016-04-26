package hackerrank.algorithms.strings;

import java.util.Scanner;

/**
 * Created by abhiramk on 24/08/15.
 */
public class FunnyString {

    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int limit = sin.nextInt();
        boolean isFunny = true;
        for(int i = 0; i< limit; i++) {
            char[] s = sin.next().toCharArray();
            for(int j=0; j< s.length-1; j++) {
                if(Math.abs(Character.getNumericValue(s[j+1])- Character.getNumericValue(s[j])) !=
                        Math.abs(Character.getNumericValue(s[s.length-j-2]) - Character.getNumericValue(s[s.length-j-1]))
                        ) {
                    isFunny = false;
                    break;
                }
            }
            if(isFunny)
                System.out.println("Funny");
            else
                System.out.println("Not Funny");
        }
    }

}
