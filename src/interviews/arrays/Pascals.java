package interviews.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Pascals {
  public ArrayList<ArrayList<Integer>> generate(int A) {
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    for (int line = 1; line <= A; line++)
    {
      int C = 1;  // used to represent C(line, i)
      ArrayList<Integer> mid = new ArrayList<>();
      for (int i = 1; i <= line; i++)
      {
//        printf("%d ", C);  // The first value in a line is always 1
        mid.add(C);
        C = C * (line - i) / i;
      }
      result.add(mid);
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner sin = new Scanner(System.in);
    int test = sin.nextInt();
    Pascals p = new Pascals();
    ArrayList<ArrayList<Integer>> generate = p.generate(test);
    System.out.println(generate);
  }
}
