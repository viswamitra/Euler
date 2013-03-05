import java.util.ArrayList;

public class EvenFibonacci {
	public static void main(String[] args) {
		int sum = 0;
		int element;
		ArrayList<Integer> elem = new ArrayList<Integer>();
		
		elem.add(1);
		elem.add(2);
		
		for(int i = 2; i < 10000; i++) {
			element = 0;
			element = elem.get(i-1) + elem.get(i-2);
			elem.add(element);
			if (element <= 4000000) {
				System.out.println(element);
				System.out.println(i);
			}
			else {
				break;
			}
		}
		
		for(int i = 0; i< elem.size(); i++) {
			if(elem.get(i) % 2 == 0) {
				sum += elem.get(i);
			}
		}
		
		System.out.println("--> Viola"+sum);
		
		
}
}
