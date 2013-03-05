import java.util.HashMap;
import java.util.Scanner;


public class Holes {
	public static void main(String[] args) {
		HashMap<Character, Integer> holeMap = new HashMap<Character, Integer>();
		holeMap.put('A', 1);
		holeMap.put('B', 2);
		holeMap.put('D', 1);
		holeMap.put('O', 1);
		holeMap.put('P', 1);
		holeMap.put('Q', 1);
		holeMap.put('R', 1);		
		Scanner reader = new Scanner(System.in);	
		int t = reader.nextInt();
		for(int i = 1; i<= t+1; i++) {
			String cas = reader.nextLine();
			int casHoles = 0;
			char[] casChars = cas.toCharArray();
			for (char ch : casChars) {
				if(holeMap.containsKey(ch)) {
					casHoles+=casHoles + holeMap.get(ch);
				}
			}
			System.out.println(casHoles);
		}
		
		
	}
}
