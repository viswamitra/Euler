package topcoder;

public class Chopsticks {

	public int getmax(int[] length) {
		int k = length.length;
		int[] bitArray = new int[100];
		int count = 0;
		for(int i = 0; i< 100; i++) {
			bitArray[i] = 0;
		}
		
		for(int i = 0;i<k;i++) {
			bitArray[length[i]]++;
		}
		
		for(int i = 0; i< 100; i++) {
			if (bitArray[i] %2 == 0 && bitArray[i] >0) {
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		int[] length = new int[] {1,2,3,4,5,6,7,8,9};
		Chopsticks c = new Chopsticks();
		System.out.println(c.getmax(length));
	}
}
