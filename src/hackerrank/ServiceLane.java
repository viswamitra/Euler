package hackerrank;

import java.util.Scanner;

/**
 * Created by abhiramk on 25/03/15.
 */
public class ServiceLane {

    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        String[] test = sin.nextLine().split(" ");
        int width = Integer.parseInt(test[0]);
        int size = Integer.parseInt(test[1]);
        int[] widthArrayInt = new int[width];
        String[] widthArray = sin.nextLine().split(" ");

        for(int i = 0; i< widthArray.length; i++) {
            widthArrayInt[i] = Integer.parseInt(widthArray[i]);
        }

        for(int i = 0; i< size; i++) {
             String[] list = sin.nextLine().split(" ");
             int source = Integer.parseInt(list[0]);
             int destination = Integer.parseInt(list[1]);

             int max = 4;


            for(int j = source; j<= destination ; j++) {
                if (widthArrayInt[j] < max) {
                    max = widthArrayInt[j];
                }

             }
            System.out.println(max);
        }




    }
}
