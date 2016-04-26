package hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * Created by abhiramk on 01/04/16.
 */
public class TimeConversion {
    public static void main(String[] args) {

        while(true) {
            Scanner sin = new Scanner(System.in);
            String time = sin.next();
            //12:30:23AM
            int hours = Integer.valueOf(time.substring(0,2));
            int min = Integer.valueOf(time.substring(3,5));
            int sec = Integer.valueOf(time.substring(6, 8));
            String am_pm = time.substring(8,10);



            if(am_pm.equalsIgnoreCase("AM")) {
                if(hours == 12)
                    hours = 0;
            }else {
                if(hours == 12) {

                } else {
                    hours = hours+12;
                }


            }
            String hours_s = null;
            String min_s = null;
            String sec_s = null;
            if(hours < 10) {
                hours_s = "0"+Integer.toString(hours);
            } else {
                hours_s = Integer.toString(hours);
            }
            if(min < 10) {
                min_s = "0"+Integer.toString(min);
            } else {
                min_s = Integer.toString(min);
            }

            if(sec < 10) {
                sec_s = "0"+Integer.toString(sec);
            } else {
                sec_s = Integer.toString(sec);
            }

            System.out.println(hours_s+":"+min_s+":"+sec_s);
        }

    }
}
