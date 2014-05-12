package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FingGn {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		long n = Integer.parseInt(bf.readLine());
		System.out.println(func(n));
	}
	
	public static double func(long n) {
		return Math.pow(n, 2);
	}
}
