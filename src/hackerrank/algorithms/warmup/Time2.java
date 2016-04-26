package hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * Created by abhiramk on 02/04/16.
 */
public class Time2 {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        String time = sin.next();


        int hours = Integer.valueOf(time.substring(0,2));
        int min = Integer.valueOf(time.substring(3,5));
        int sec = Integer.valueOf(time.substring(6, 8));
        String am_pm = time.substring(8,10);

        if(am_pm.equalsIgnoreCase("AM")) {
            if(hours == 12)
                hours = 0;
        } else {
            hours = hours+12;
        }



    }
}
