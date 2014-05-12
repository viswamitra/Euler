package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * User: abhiramk
 * Date: 21/09/13
 * Time: 4:51 PM
 * This file is the one this project deserves, but not the one it needs
 */
public class Candy1 {

    public static void main(String[] args) throws IOException {
        BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
        int[] bags ;
        int sum;
        int avg;

        while(true) {
            int packets = Integer.valueOf(bin.readLine());
            if(packets == -1){
                return;
            } else {
                bags = new int[packets];
                sum = 0;
                for(int i=0;i< packets; i++) {
                    bags[i] = Integer.valueOf(bin.readLine());
                    sum+=bags[i];
                }
                if(sum % packets != 0) {
                    System.out.println(-1);
                    continue;
                }else {
                    avg = sum/packets;
                }
                int diff = 0;
                for(int i=0;i< packets; i++) {
                    if(avg > bags[i])  {
                        diff += (avg-bags[i]);
                    }
                }
                System.out.println(diff);
            }
        }
    }
}
