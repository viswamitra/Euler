package Utils;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Utils {

  static void plusMinus(int[] arr) {
    int pos = 0;
    int neg = 0;
    int zero = 0;
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] > 0) {
        pos++;
      } else if(arr[i] < 0) {
        neg++;
      } else {
        zero++;
      }
    }

    DecimalFormat df = new DecimalFormat("#.######");
    System.out.println(df.format((double) pos/arr.length));
    System.out.println(df.format((double)neg/arr.length));
    System.out.println(df.format((double)zero/arr.length));
  }


  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[n];
    for(int arr_i = 0; arr_i < n; arr_i++){
      arr[arr_i] = in.nextInt();
    }
    plusMinus(arr);
    in.close();

  }
}
