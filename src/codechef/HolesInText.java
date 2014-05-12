package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class HolesInText {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('A', 1);
		map.put('B', 2);
		map.put('D', 1);
		map.put('O', 1);
		map.put('P', 1);
		map.put('Q', 1);
		map.put('R', 1);
		
		for(int i = 0; i< n; i++) {
			String inp = in.readLine();
			char[] inps = inp.toCharArray();
			int holes = 0;
			
			for(char inpC: inps) {
				if(map.containsKey(inpC))
					holes += map.get(inpC);
			}
			System.out.println(holes);	
		}
	}
}
