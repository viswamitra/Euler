package gcj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TicTacToe {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		long n = Integer.parseInt(bf.readLine());
		for (int i = 0; i < n ; i++) {
			char[][] board = new char[4][4];
			for(int j=0;j<4;j++) {
				String line = bf.readLine();
				board[j] = line.toCharArray();
				
			}
			String empty = bf.readLine();
		
			System.out.println("Case #"+(i+1)+": "+calculate(board));
		
		}
	}

	private static String calculate(char[][] board) {
		int xlim = 4;
		int ylim = 4;
		
		
		// row calculation
		for(int row=0; row< xlim;row++) {
			int rowSum = 0;
			for(int col=0;col<ylim;col++) {
				rowSum += (int) board[row][col];
			}
			if(rowSum == 348 || rowSum == 352) {
				return "X won";
			}if(rowSum == 321 || rowSum == 316) {
				return "O won";
			}
		}
		
		for(int col=0; col< ylim;col++) {
			int colSum = 0;
			for(int row=0; row<xlim;row++) {
				colSum += (int) board[row][col];
			}
			if(colSum == 348 || colSum == 352) {
				return "X won";
			}if(colSum == 321 || colSum == 316) {
				return "O won";
			}
		}
		
		int diagSum = board[0][0]+ board[1][1]+ board[2][2]+board[3][3];
		int antidiagSum = board[0][3] + board[1][2]+board[2][1]+board[3][0];
		
		if(diagSum == 348 || diagSum == 352) {
			return "X won";
		}		
		if(diagSum == 321 || diagSum == 316) {
			return "O won";
		}
		if(antidiagSum  == 321 || antidiagSum == 316) {
			return "O won";
		}
		if(antidiagSum  == 348 || antidiagSum == 352) {
			return "O won";
		}
		
		for(int row=0; row< xlim;row++) {
			for(int col=0;col<ylim;col++) {
				if(board[row][col] == '.') {
					return "Game has not completed";
				}
			}
		}
		return "Draw";
	}
}
