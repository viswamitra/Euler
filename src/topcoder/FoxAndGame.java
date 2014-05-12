package topcoder;

/*
 * SRM 571 DIV 2
 * practice
 */

public class FoxAndGame {

	public int countStarts(String[] elements) {
		int count = 0;
		String three = "ooo";
		String two = "oo-";
		String one = "o--";
		String zero = "---";
		 
		for(String element: elements) {
			if(element.equals(three) == true) {
				count+=3;
			}else if (element.equals(two) == true) {
				count+=2;
			}else if (element.equals(one) == true) {
				count+=1;
			}else {
				count+=0;
			}
		}
		return count; 
	}
	
	public static void main(String[] args) {
		FoxAndGame f = new FoxAndGame();
		String[] elements = new String[] {"ooo","o--","oo-","---"};
		int result = f.countStarts(elements);
		System.out.println(result);
	}
}
