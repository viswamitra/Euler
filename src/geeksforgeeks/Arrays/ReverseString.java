package geeksforgeeks.Arrays;

public class ReverseString {

  public static void main(String[] args) {
    int[] input = {1,2,3,4,5,6};
    reverse(input, 0, 5);
    print(input);
  }

  private static void print(int[] input) {
    for(int i = 0; i< input.length; i++) {
      System.out.print(input[i] + " ");
    }
  }

  private static void reverse(int[] input, int start, int end) {
    int temp;
    while(start <= end) {
      temp = input[start];
      input[start] = input[end];
      input[end] = temp;
      start++;
      end--;
    }
  }


}
