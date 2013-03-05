
public class PrimeFactors {
	
	public static void main(String[] args) {
		long ans = 1;
		long k = 600851475143l;
		long temp = k;
		for ( long x = 2; x <= temp/2; x++) {			 
			//System.out.println("itera->"+x);
			while( k % x ==0) {
				System.out.println("first-->"+k+" "+x);
				k = k/x;
				ans = x;
				System.out.println(k+" "+ans);
			}
		}
		System.out.println(ans);

		
	}

}
