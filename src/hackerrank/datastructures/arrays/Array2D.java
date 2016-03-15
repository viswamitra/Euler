package hackerrank.datastructures.arrays;

import java.util.Scanner;

/**
 * Created by abhiramk on 14/03/16.
 */
public class Array2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }

        int sum = 0;
        for(int i=0; i<4; i++) {
            for(int j=0; j<4; j++) {
                int currSum = getHourGlassSum(arr, i, j);
                if (sum < currSum)
                    sum = currSum;
            }
        }
        System.out.println(sum);

//        for(int arr_i=0; arr_i < 3; arr_i++){
//            for(int arr_j=0; arr_j < 3; arr_j++){
//                System.out.print(arr[arr_i][arr_j] + " ");
//            }
//            System.out.println();
//        }
    }

    private static int getHourGlassSum(int[][] arr, int i, int j) {
        return (arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]);
    }
}