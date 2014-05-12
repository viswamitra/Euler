package spoj;

import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.math.BigInteger;
public class LastDig {    public static void main(String[] args) throws IOException {
            BufferedReader bin=new BufferedReader(new InputStreamReader(System.in));
            int t=Integer.valueOf(bin.readLine());
            BigInteger x;
            BigInteger y;
            for(int i=0;i<t;i++){
                String[] inp=bin.readLine().split(" ");
                int base = Integer.valueOf(inp[0]);
                int power = Integer.valueOf(inp[1]);
                x = BigInteger.valueOf(1);
                y = BigInteger.valueOf(base);
                while(power > 0) {
                    if(power %2 ==1) {
                        x = x.multiply(y).mod(BigInteger.valueOf(10));
                    }
                    y = y.multiply(y).mod(BigInteger.valueOf(10));
                    power/=2;
                }
                System.out.println(x.mod(BigInteger.valueOf(10)));
        }

    }
}
