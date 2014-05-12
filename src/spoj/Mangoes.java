package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Mangoes {

		public static void main(String[] args) throws IOException {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(bf.readLine());

			for(int i = 0; i< n; i++) {
				long inp = Integer.parseInt(bf.readLine());
				if(inp%2 == 0) {
					System.out.println(((inp-2)/2*(inp-2)/2)%inp);
				}else{
					System.out.println(((inp-1)/2*(inp-1)/2)%inp);
				}
					
			}
			
//			System.out.println(gcd(2,4));
		}
	}

