package RPNEvaluator;

import java.util.Scanner;

public class Driver {

  public static void main(String[] args) {
    Scanner sin = new Scanner(System.in);
    Integer tests = Integer.parseInt(sin.nextLine());
    for(int i = 0; i < tests; i++) {
      String input = sin.nextLine();
      RPNEvaluator evaluator = new RPNEvaluator();
      try {
        String output = evaluator.evaluate(input);
        System.out.println(output);
      } catch (Exception e) {
        System.out.println("Exception "+ e.getMessage());
      }

    }
  }
}
