package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palin {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());

		for (int i = 0; i < n; i++) {
			String s = bf.readLine();
			System.out.println(nextPalindrome(s));
		}
	}
	public static String nextPalindrome(String s) {
		if(s.length() == 1) {
			int single = Integer.parseInt(s);
			return Integer.toString(++single);
		}
		if(s.length() == 2) {
			int doub = Integer.parseInt(s);
			while(true) {
				if(isPalindrom(Integer.toString(++doub)))
						break;
			}
			return Integer.toString(doub);
		}
//		int firstLetter =
        return new String();
	}
	
	public static Boolean isPalindrom(String res) {
		StringBuilder srb = new StringBuilder();
		srb.append(res);
		StringBuilder srb2 = srb.reverse();
		if (srb2.toString().equals(res)) {
			return true;
		} else {
			return false;
		}
	}
}
