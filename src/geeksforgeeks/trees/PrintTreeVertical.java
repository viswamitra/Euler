package geeksforgeeks.trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a binary tree, print it vertically. The following example illustrates vertical order traversal.
 *                    1
                    /    \
                   2      3
                  / \   /   \
                4   5  6   7
                          /  \
                          8   9
 The output of print this tree vertically will be:
 4
 2
 1 5 6
 3 8
 7
 9
 */
public class PrintTreeVertical {

  public void printVerticalOrder(Tree root) {
    Map<Integer, List<Integer>> m = new HashMap<>();
    int dist = 0;
    printUtil(root, 0, m);
    m.forEach((k,v) -> System.out.println(v));
  }

  private void printUtil(Tree root, int dist, Map<Integer, List<Integer>> m) {
    if(root == null) {
      return;
    }
    List<Integer> integers = m.get(dist);

    if(integers == null) {
      integers = new ArrayList<>();
      integers.add(root.data);
    } else {
      integers.add(root.data);
    }
    m.put(dist, integers);


    printUtil(root.right, dist +1, m);
    printUtil(root.left, dist -1, m);
  }

  public static void main(String[] args) {
    PrintTreeVertical solution = new PrintTreeVertical();
    Tree root = new Tree(1);
    root.left = new Tree(2);
    root.right = new Tree(3);
    root.left.left = new Tree(4);
    root.left.right = new Tree(5);
    root.right.left = new Tree(6);
    root.right.right = new Tree(7);
    root.right.left.right = new Tree(8);
    root.right.right.right = new Tree(9);
    System.out.println("Vertical Order traversal is");
    solution.printVerticalOrder(root);
  }

}
