package geeksforgeeks.graphs.interviewquestions;

import java.util.Scanner;

/**
 * Created by abhiramk on 31/03/16.
 */
public class StringReversal {

    public static void main(String[] args) {

        Scanner sin = new Scanner(System.in);
        char[] input = sin.next().toCharArray();

        int start = 0;
        int end = input.length-1;

        while (start < end) {
            char temp = input[start];
            input[start] = input[end];
            input[end] = temp;

            start++;
            end--;
        }

        System.out.println(input.toString());
    }
}
