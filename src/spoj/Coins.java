package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * In Byteland they have a very strange monetary system.
 Each Bytelandian gold coin has an integer number written on it. A coin n can be exchanged in a bank into three coins: n/2, n/3 and n/4. But these numbers are all rounded down (the banks have to make a profit).
 You can also sell Bytelandian coins for American dollars. The exchange rate is 1:1. But you can not buy Bytelandian coins.
 You have one gold coin. What is the maximum amount of American dollars you can get for it?
 Input
 The input will contain several test cases (not more than 10). Each testcase is a single line with a number n, 0 <= n <= 1 000 000 000. It is the number written on your coin.

 Output
 For each test case output a single line, containing the maximum amount of American dollars you can make.

 Input:
 12
 2

 Output:
 13
 2

 You can change 12 into 6, 4 and 3, and then change these into $6+$4+$3 = $13.
 If you try changing the coin 2 into 3 smaller coins, you will get 1, 0 and 0, and later you can get no more than $1 out of them.
 It is better just to change the 2 coin directly into $2.

 * Created by abhiram on 15/9/16.
 */
public class Coins {
        static long[] store = new long[1000000];
        public static void main(String[] args) throws IOException {





            for(int i =1; i<1000000; i++) {


                Long val = store[i/2] + store[i/3] + store[i/4];
    //            BigInteger res = val.max(BigInteger.valueOf(i));
    //            Long res = ;
                store[i] = Math.max(val, i);
            }
    //
            BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
            while(true) {
                try {
                    long val = Long.parseLong(bin.readLine());
                    long res = meth(val);
                    System.out.println(res);
                } catch(Exception e) {
                    break;
                }

            }


        }

        private static long meth(long i) {
            if(i==0)
                return 0;
            if(i<=1000000)
                return store[(int)i];
    //        BigInteger inp = BigInteger.valueOf(i);
            return Math.max(i, meth(i/2)+meth(i/3)+meth(i/4));
    //        return inp.max(meth(i/2).add(meth(i/3)).add(meth(i/4)));
        }

}
