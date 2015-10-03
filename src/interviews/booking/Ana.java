package interviews.booking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by abhiramk on 27/09/15.
 */
public class Ana {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        String[] numSplit = s.split(" ");
        Integer[] resSplit = new Integer[numSplit.length];
        resSplit[0] = Integer.valueOf(numSplit[0]);
        System.out.print(resSplit[0]+" ");
        for(int i = 0; i < numSplit.length -1 ; i++) {
            int num1= Integer.valueOf(numSplit[i]);
            int num2= Integer.valueOf(numSplit[i+1]);
            resSplit[i+1] = num2 - num1;
        }


        for(int i = 1; i< resSplit.length; i++) {
//            System.out.print(resSplit[i]+" ");
            if (resSplit[i] >= 127 || resSplit[i] <= -127) {
                System.out.print("-128 ");
                System.out.print(resSplit[i]+" ");
            }
            else
                System.out.print(resSplit[i]+" ");
        }

    }
}
