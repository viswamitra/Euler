package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by abhiramk on 22/05/14.
 */
public class Absys {
    public static void main(String[] args) throws IOException {
        BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(bin.readLine());
        for(int i =0; i< input; i++) {
            bin.readLine();
            String line = bin.readLine();
            processString(line);
        }
    }

    private static void processString(String line) {
        String firstNumber = line.substring(0, line.indexOf('+')).trim();
        String secondNumber = line.substring(line.indexOf('+')+2, line.indexOf("=")-1).trim();
        String thirdNumber = line.substring(line.indexOf('=')+2, line.length());

        int machulaPresent = 0;


        if(firstNumber.contains("machula")) {
            machulaPresent = 1;
        } else if (secondNumber.contains("machula")) {
            machulaPresent = 2;
        } else {
            machulaPresent = 3;
        }

        int num1, num2, num3;
        if(machulaPresent == 1) {
             num3 = Integer.parseInt(thirdNumber);
             num2 = Integer.parseInt(secondNumber);
             num1 = num3 - num2;
        } else if ( machulaPresent == 2) {
             num3 = Integer.parseInt(thirdNumber);
             num1 = Integer.parseInt(firstNumber);
             num2 = num3 - num1;
        } else {
             num1 = Integer.parseInt(firstNumber);
             num2 = Integer.parseInt(secondNumber);
             num3 = num1 + num2;
        }
        System.out.println(Integer.toString(num1)+" + "+Integer.toString(num2)+" = "+Integer.toString(num3));
    }
}
