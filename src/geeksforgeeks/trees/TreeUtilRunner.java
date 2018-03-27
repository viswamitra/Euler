package geeksforgeeks.trees;

public class TreeUtilRunner {

  public static void main(String[] args) {
    Tree tree = new Tree(1);
    tree.right = new Tree(3);
    tree.left = new Tree(2);

    tree.left.left = new Tree(4);
    tree.left.right = new Tree(5);

    tree.right.left = new Tree(6);
    tree.right.right = new Tree(7);
    TreeUtil util = new TreeUtil();
    util.topView(tree);
  }

}
