package hackerrank.datastructures.stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * https://www.hackerrank.com/challenges/ctci-balanced-brackets/problem
 */
public class BalancedBrackets {

  public static boolean isBalanced(String expression) {
    expression.replace("\n", "");
    String[] ex = expression.split("");

    Stack<String> stack = new Stack<>();
    if(ex.length %2 == 1) {
      return false;
    } else {
      stack.push(ex[0]);
      for(int i = 1; i < ex.length; i++) {
        if(stack.isEmpty()) {
          stack.push(ex[i]);
          continue;
        }
        String peeked = stack.peek();
        if(peeked.equalsIgnoreCase(")") || peeked.equalsIgnoreCase("}") || peeked.equalsIgnoreCase("]")) {
          return false;
        }
        else if(ex[i].equalsIgnoreCase(")") && peeked.equalsIgnoreCase("(") ||
            ex[i].equalsIgnoreCase("}") && peeked.equalsIgnoreCase("{") ||
            ex[i].equalsIgnoreCase("]") && peeked.equalsIgnoreCase("[")) {
          stack.pop();

        } else {
          stack.push(ex[i]);
        }
      }

      if(stack.isEmpty()) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for (int a0 = 0; a0 < t; a0++) {
      String expression = in.next();
      System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
    }
  }}
