package RPNEvaluator;

public class Validator {

  public boolean isOperand(String input) {
    try
    {
      Integer.parseInt(input);
    }
    catch(NumberFormatException nfe)
    {
      return false;
    }
    return true;
  }

  public boolean isOperator(String input) {
    return input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/");
  }

}
