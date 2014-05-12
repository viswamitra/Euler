package gcj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FairAndSquare {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		long t = Integer.parseInt(bf.readLine());
		for (int i = 0; i < t; i++) {
			String[] inps = bf.readLine().split(" ");
			long n = Long.parseLong(inps[0]);
			long m = Long.parseLong(inps[1]);
			int count = 0;
			for (long k = n; k <= m; k++) {
				if (isPalindrome(k)) {
					if(isSquare(k)) {
						count++;
					}
						
						
				}
			}
			System.out.println("Case #"+(i+1)+": "+count);
		}
	}

	private static boolean isSquare(long k) {
		long p = (long) Math.sqrt(k);
		if ( p * p == k) 
			if(isPalindrome(p))
				return true;
		return false;
	}

	private static boolean isPalindrome(long k) {
		String a = Long.toString(k);
		String b = reverse(a);
		if(a.equals(b)) {
			return true;
		}else {
			return false;	
		}
			
		
	}
	public static String reverse(String a) {
		if(a.length() == 0) return "";
		return a.charAt(a.length()-1) + reverse(a.substring(0, a.length()-1));
	}
}
