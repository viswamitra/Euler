package Utils;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by brinder.singh on 03/03/18
 */

    /*

    Write a program to parse and calculate the value of a mathematical expression. Expressions can contain positive integers and the operators '+', '-', '*', '/', with the usual rules of evaluation. Expressions are in RPN format (reverse polish notation) and should be evaluated in stack order. Expression input with be a String. The calculated value should be a single floating-point value with three decimals of precision.

    Example input and output:

    +-----------------------+--------------------+
    |      Input            |    Expected Output |
    +-----------------------+--------------------+
    |     "3 4 *"           |      12.000        |
    +-----------------------+--------------------+
    |      "7 3 /"          |      2.333         |
    +-----------------------+--------------------+
    |  "2 3 * 2 1 1 + + *"  |      24.000        |x
    +-----------------------+--------------------+

    A few of the things we look for in your solution are: design, code quality, and correctness.
    Extend you program to use the RPN calculator from Part 1 to compute values of cells in a spreadsheet.
    A spreadsheet consists of a two dimensional array of cells, labeled A1, A2, etc. Rows are identified using letters, columns by numbers. Each cell contains either an integer or an expression. Expressions will be limited to those defined in part 1, with the addition of cell references. The value of a reference is the value of the spreadsheet cell is refers to.

    The spreadsheet input is a String containing multiple lines defined as follows:

    • Line 1: two integers, defining the width and height of the spreadsheet (n, m)

    • n*m lines each containing an expression which is the value of the corresponding cell. Cells are enumerated in the order A1, A2, A<n>,  B1.


    Your program must output its data in the same format, but each cell should be reduced to a single floating-point value.

    +-----------------------+------------------+
    |        Input          | Expected Output  |
    +-----------------------+------------------+
    |        3 2            |   3 2            |
    +-----------------------+------------------+
    |        A2             |   20.000         |
    +-----------------------+------------------+
    |        4 5 *          |   20.000         |
    +-----------------------+------------------+
    |        A1             |   20.000         |
    +-----------------------+------------------+
    |     A1 B2 / 2 +       |   8.667          |
    +-----------------------+------------------+
    |        3              |   3.000          |
    +-----------------------+------------------+
    |      39 B1 B2 * /     |   1.500          |
    +-----------------------+------------------+


    The input for the above example visually looks like this:

      | 1           | 2     |  3           |

    --+-------------+-------+--------------+

    A | A2          | 4 5 * | A1           |

    --+-------------+-------+--------------+

    B | A1 B2 / 2 + | 3     | 39 B1 B2 * / |

    ------------------------+--------------+
    */
public class Sol {

  /*
   * class to evaluate expression matrix
   */
  public static class EvaluateExpressionMatrix {

    private static List<String> evaluate(int rows, int cols, String[] input) {
      //create graph
      final Map<String, ExpressionNode> expressionGraph = getGraphFromExcel(rows, cols, input);

      //create topological order
      List<String> verticesInTopologicalOrder = getTopologicalSortedVertices(expressionGraph);

      //evaluate
      evaluateTopologicalSortedGraph(expressionGraph, verticesInTopologicalOrder);

      return expressionGraph.entrySet().stream().map((Map.Entry<String, ExpressionNode> x) ->
          x.getValue().getFormattedOutput()).collect(Collectors.toList());
    }

    private static void evaluateTopologicalSortedGraph(Map<String, ExpressionNode> expressionGraph,
                                                       List<String> verticesInTopologicalOrder) {
      verticesInTopologicalOrder.forEach(vertexKey -> {
        ExpressionNode vertex = expressionGraph.get(vertexKey);

        //evaluate references first and halt for current if issue found
        if (evaluateReferences(expressionGraph, vertex)) return;

        Double val = ExpressionEvaluator.evaluateRPNExpression(vertex.getExpression());
        if (val == null) {
          vertex.setExpressionIssue(ExpressionNode.ExpressionIssue.WRONG_EXPRESSION);
        } else {
          vertex.setOutput(val);
        }
      });
    }

    private static boolean evaluateReferences(Map<String, ExpressionNode> expressionGraph, ExpressionNode vertex) {
      Set<String> verticesSet = expressionGraph.keySet();
      for (int i = 0; i < vertex.getExpression().length; i++) {
        String expressionNode = vertex.getExpression()[i];
        if (verticesSet.contains(expressionNode)) {
          ExpressionNode node = expressionGraph.get(expressionNode);
          //if reference expression has issue, this node can't be evaluated
          if (node.hasError()) {
            vertex.setExpressionIssue(ExpressionNode.ExpressionIssue.WRONG_EXPRESSION);
            return true;
          }
          vertex.getExpression()[i] = String.valueOf(expressionGraph.get(expressionNode).getOutput());
        }
      }
      return false;
    }

    private static Map<String, ExpressionNode> getGraphFromExcel(int rows, int cols, String[] excelInput) {

      final Map<String, ExpressionNode> expressionGraph = new TreeMap<>();

      //generate graph Vertices
      for (int i = 0; i < rows; i++) {
        String rowId = Utils.getExcelRowId(i);
        for (int j = 0; j < cols; j++) {
          expressionGraph.put(rowId + (j + 1),
              new ExpressionNode(Utils.splitStringBySpaces(excelInput[i * cols + j])));
        }
      }

      //generate graph Edges
      final Set<String> verticesSet = expressionGraph.keySet();
      expressionGraph.forEach((key, value) ->
          value.setAdjacentNodes(getGraphVerticesInExpression(verticesSet,
              value.getExpression())));
      return expressionGraph;
    }


    private static List<String> getTopologicalSortedVertices(Map<String, ExpressionNode> expressionGraph) {
      Set<String> visitedSet = new HashSet<>();
      Set<String> currPathSet = new HashSet<>();
      List<String> verticesInTopologicalOrder = new ArrayList<>();
      expressionGraph.forEach((key, value) -> {
            if (!visitedSet.contains(key)) {
              addTopologicalOrderInQueue(key, verticesInTopologicalOrder, expressionGraph, visitedSet, currPathSet);
            }
          }
      );
      return verticesInTopologicalOrder;
    }

    private static void addTopologicalOrderInQueue(String currVertex,
                                                   List<String> verticesInToplogicalOrder,
                                                   Map<String, ExpressionNode> expressionGraph,
                                                   Set<String> visitedSet,
                                                   Set<String> currPathSet) {
      visitedSet.add(currVertex);
      currPathSet.add(currVertex);
      boolean hasCycle = false;
      for (String adjacentNode : expressionGraph.get(currVertex).getAdjacentNodes()) {
        //check if dependent vertex has cycle or there is a back edge
        if (expressionGraph.get(adjacentNode).hasCycle() ||
            currPathSet.contains(adjacentNode)) {
          hasCycle = true;
          break;
        }

        if (!visitedSet.contains(adjacentNode)) {
          addTopologicalOrderInQueue(adjacentNode, verticesInToplogicalOrder, expressionGraph, visitedSet, currPathSet);

          //check if cycle found after recursion
          if (expressionGraph.get(adjacentNode).hasCycle()) {
            hasCycle = true;
            break;
          }
        }

      }
      if (hasCycle) {
        expressionGraph.get(currVertex).setCycle();
      } else {
        verticesInToplogicalOrder.add(currVertex);
      }
      currPathSet.remove(currVertex);

    }

    private static Set<String> getGraphVerticesInExpression(Set<String> verticesSet, String[] expression) {
      return Arrays.stream(expression).filter(verticesSet::contains).collect(Collectors.toSet());
    }
  }

  /*
   * class to evaluate single expression
   */
  public static class ExpressionEvaluator {

    static Double evaluateRPNExpression(String expression) {
      String[] expressionElements = Utils.splitStringBySpaces(expression);
      return evaluateRPNExpression(expressionElements);
    }

    public static Double evaluateRPNExpression(String[] expressionElements) {
      Stack<Double> stack = new Stack<>();
      for (String expressionElement : expressionElements) {
        OP op = isOperator(expressionElement);
        if (op != OP.OPERAND) {
          if (!checkIfExValid(stack, true)) {
            return null;
          }
          Double first = stack.pop();
          Double second = stack.pop();
          stack.push(applyOp(op, first, second));
        } else {
          Double num = getDoubleVal(expressionElement);
          if (num == null) {
            return null;
          }
          stack.push(num);
        }
      }

      if (stack.size() == 1) {
        return Utils.round(stack.pop(), 3);
      } else {
        return null;
      }

    }


    private static void printIllegalExpressionWarning() {
      System.err.println("Expression is not valid");
    }


    private static Double getDoubleVal(String num) {
      try {
        return Double.valueOf(num);
      } catch (NumberFormatException e) {
        return null;
      }

    }

    private static Double applyOp(OP op, Double first, Double second) {
      switch (op) {
        case ADD:
          return first + second;
        case SUB:
          return second - first;
        case MUL:
          return first * second;
        case DIV:
          return second / first;
        default:
          return null;
      }
    }

    private static boolean checkIfExValid(Stack<Double> stack, boolean isCurrValOperator) {
      if (isCurrValOperator) {
        if (stack.size() < 2) {
          return false;
        }
      }
      return true;
    }

    enum OP {
      ADD,
      SUB,
      MUL,
      DIV,
      OPERAND
    }

    private static OP isOperator(String val) {
      switch (val) {
        case "+":
          return OP.ADD;
        case "-":
          return OP.SUB;
        case "*":
          return OP.MUL;
        case "/":
          return OP.DIV;
        default:
          return OP.OPERAND;
      }
    }

  }

  static class ExpressionNode {
    public String[] getExpression() {
      return expression;
    }

    public Set<String> getAdjacentNodes() {
      return adjacentNodes;
    }

    private String[] expression;
    private Set<String> adjacentNodes;
    private Double output;

    public ExpressionIssue getExpressionIssue() {
      return expressionIssue;
    }

    private ExpressionIssue expressionIssue;

    enum ExpressionIssue {
      WRONG_EXPRESSION("Expression is invalid"),
      CYCLIC_NODE("Expression cannot be solved due to cycle");

      String message;

      ExpressionIssue(String message) {
        this.message = message;
      }
    }

    public ExpressionNode(String[] expression) {
      this.expression = expression;
    }

    public void setAdjacentNodes(Set<String> adjacentNodes) {
      this.adjacentNodes = adjacentNodes;
    }

    public void setExpressionIssue(ExpressionIssue expressionIssue) {
      this.expressionIssue = expressionIssue;
    }

    public void setOutput(Double output) {
      this.output = output;
    }

    public Double getOutput() {
      return output;
    }

    public boolean hasCycle() {
      return expressionIssue == ExpressionIssue.CYCLIC_NODE;
    }

    public void setCycle() {
      expressionIssue = ExpressionIssue.CYCLIC_NODE;
    }

    public boolean hasError() {
      return expressionIssue != null;
    }

    public String getFormattedOutput() {
      if (hasError()) {
        return expressionIssue.message;
      } else {
        return Utils.formatToThreePlaces(output);
      }
    }
  }

  public static class Utils {
    public static Double round(Double num, int places) {
      double factor = Math.pow(10, places);
      return Math.round(num * factor) / factor;
    }

    public static String formatToThreePlaces(Double num) {
      DecimalFormat df = new DecimalFormat("#.000");
      return df.format(num);
    }

    static String getExcelRowId(int num) {
      num++;
      StringBuilder sb = new StringBuilder();
      while (num > 0) {
        num--;
        sb.insert(0, String.valueOf((char) (num % 26 + 'A')));
        num /= 26;
      }
      return sb.toString();
    }

    public static String[] splitStringBySpaces(String expression) {
      return expression.split("\\s+");
    }
  }

  public static void main(String[] args) {
//        String[] inputs = {
//                "+ +",
//                "7 3 /",
//                "2 3 * 2 1 1 + +"
//
//        };
//        for (String input : inputs) {
//            Double val = ExpressionEvaluator.evaluateRPNExpression(input);
//            if (val != null) {
//                System.out.println(Utils.formatToThreePlaces(val));
//            } else {
//                ExpressionEvaluator.printIllegalExpressionWarning();
//            }
//        }


//        String input[] = {
//                "A2",
//                "4 5 *",
//                "A1",
//                "A1 B2 / 2 +",
//                "3",
//                "39 B1 B2 * /"
//        };

    String input[] = {
        "A2",
        "A1",
        "4 5 * *",
        "A1 B2 / 2 +",
        "3",
        "39 B1 B2 * /"
    };

    EvaluateExpressionMatrix.evaluate(2, 3, input).forEach(System.out::println);
  }
}
