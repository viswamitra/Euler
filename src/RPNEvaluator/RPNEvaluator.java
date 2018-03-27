package RPNEvaluator;

import java.util.Stack;

public class RPNEvaluator implements Evaluator {

  private Stack<String> evaluatorStack;
  private Validator validator;

  public RPNEvaluator() {
    evaluatorStack = new Stack<>();
    validator = new Validator();
  }

  @Override
  public String evaluate(String input) throws Exception {
    String result = "";
    String[] expression = input.split(" ");

    for (String i : expression) {
      try {
        if (validator.isOperand(i)) {
          evaluatorStack.push(i);
        }
        if (validator.isOperator(i)) {
          if (evaluatorStack.size() < 2) {
            throw new Exception("Stack Size too small");
          }
          String operandA = evaluatorStack.pop();
          String operandB = evaluatorStack.pop();
          evaluatorStack.push(calculateExpression(operandA, operandB, i));
        }
      } catch (Exception e) {
        throw e;
      }
    }
    if(evaluatorStack.size() != 1) {
      throw new Exception("stack size is too less");
    }
    return evaluatorStack.pop();
  }

  private String calculateExpression(String operandA, String operandB, String operator) throws Exception {
    Integer a = Integer.valueOf(operandA);
    Integer b = Integer.valueOf(operandB);
    switch(operator) {
      case "+":
        return String.valueOf(a+b);
      case "-":
        return String.valueOf(a-b);
      case "/":
        return String.valueOf(a/b);
      case "*":
        return String.valueOf(a*b);
      default:
        throw new Exception("Unrecoginzed operator");

    }
  }
}
