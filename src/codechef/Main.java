package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		BigDecimal num = new BigDecimal("103993");
		BigDecimal den = new BigDecimal("33102");
		for(int i = 0; i< n; i++) {
			int inp = Integer.parseInt(bf.readLine());
			if (inp == 0) {
				System.out.println(3);
				continue;
			}
			BigDecimal db = num.divide(den,inp,BigDecimal.ROUND_DOWN);
			System.out.println(db);
			
		}
	}
}
