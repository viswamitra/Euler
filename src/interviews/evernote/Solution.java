package interviews.evernote;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by abhiramk on 21/05/14.
 * challenge 3
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner sin = new Scanner(System.in);
        int input = sin.nextInt();

        int product = 1;
        List<Integer> inputArray = new ArrayList<Integer>();
        List<Integer> outputArray = new ArrayList<Integer>();
        for(int i = 0; i< input; i++) {
            int element = sin.nextInt();
            inputArray.add(element);
            product *= element;
        }

        for(int i =0; i< input; i++) {
            outputArray.add(product/inputArray.get(i));
        }
    }
}
