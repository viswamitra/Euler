package geeksforgeeks.Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CompressedString {

  public static void main(String[] args) {
    Scanner sin = new Scanner(System.in);
    char[] input = sin.nextLine().toCharArray();
    Map<Character, Integer> result = new HashMap<>();
    for(int i = 0; i < input.length; i++) {
      if(result.get(input[i]) != null) {
       int count = result.get(input[i]);
       result.put(input[i], ++count);
      } else {
        result.put(input[i], 1);
      }
    }

    result.forEach((k, v) -> System.out.print(k+""+v));
  }
}
