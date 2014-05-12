package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Addrev {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		long n = Integer.parseInt(bf.readLine());
		for (int i = 0; i < n ; i++) {
			String[] inps = bf.readLine().split(" ");
			inps[0] = reverse(inps[0]);
			inps[1] = reverse(inps[1]);
			int x = Integer.parseInt(inps[0]);	
			int y = Integer.parseInt(inps[1]);
			
			int z = x+y;
			String res = Integer.toString(z);
			System.out.println(Integer.parseInt(reverse(res)));
			
		}
	}
	
	public static String reverse(String a) {
		if(a.length() == 0) return "";
		return a.charAt(a.length()-1) + reverse(a.substring(0, a.length()-1));
	}

}
