package gcj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LawnMover {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		long t = Integer.parseInt(bf.readLine());
		for (int i = 0; i < t ; i++) {
			String[] inps = bf.readLine().split(" ");			
			int n = Integer.parseInt(inps[0]);	
			int m = Integer.parseInt(inps[1]);
			int[][] lawn = new int[n][m];
			for(int l = 0; l< n; l++) {
				String[] inpc= bf.readLine().split(" ");
				for(int k=0;k<m;k++) {
					lawn[l][k] = Integer.parseInt(inpc[k]);
				}
			}
			
			System.out.println("Case #"+(i+1)+": "+calculate(lawn, n,m));
			
//			for(int l = 0; l< n; l++) {
//				for(int k=0;k<m;k++) {
//					System.out.print(lawn[l][k]+" ");
//				}
//				System.out.println();
//			}
		}
		
		
	}

	private static String calculate(int[][] lawn, int n, int m) {
	
		for(int i = 0; i< n; i++) {
			for(int j = 0; j< m; j++) {
//				System.out.println("for element i=>"+i+" j=>"+j);
				if( !isMaxCol(lawn, i, j, n, m) && !isMaxRow(lawn, i, j, n, m) )
					return "NO";
			}
		}
		return "YES";
	}

	private static boolean isMaxRow(int[][] lawn, int i, int j, int n, int m) {
		int ele = lawn[i][j];
//		System.out.println("elem for isMaxRow=>"+ele);
		
		for(int c = 0; c< m; c++) {
//			System.out.println("c =>"+c);
			if (ele < lawn[i][c]) {
//				System.out.println("lawn element is i=>"+i+" c=>"+c);
//				System.out.println("ele =>"+ele+" is lesser than "+lawn[i][c]);
				return false;
			}
				
		}
		
		return true;
	}

	private static boolean isMaxCol(int[][] lawn, int i, int j, int n, int m) {
		int ele = lawn[i][j];
//		System.out.println("elem for isMaxRow=>"+ele);
		
		for(int c = 0; c< n; c++) {
//			System.out.println("c =>"+c);
			if (ele < lawn[c][j]) {
//				System.out.println("lawn element is c=>"+c+" j=>"+j);
//				System.out.println("ele =>"+ele+" is lesser than "+lawn[c][i]);
				return false;
			}
				
		}
		return true;
	}

	

	
}
