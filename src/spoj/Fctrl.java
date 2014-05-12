package spoj;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Fctrl{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(bf.readLine());
        for (int i = 0; i < n ; i++) {
            int inp = Integer.parseInt(bf.readLine());
            System.out.println(computeZeroes(inp));
        }
    }

    private static int computeZeroes(int n) {
        int i = 1;
        int result = 0;
        while (n>=i) {
            i*=5;
            int res = n/i;
            result += res;
        }
        return result;
    }
}


