package geeksforgeeks.trees;

public class TreeUtilRunner {

  public static void main(String[] args) {
    Tree tree = new Tree(10);
    tree.left = new Tree(16);
    tree.right = new Tree(5);
    tree.left.right = new Tree(-3);
    tree.right.left = new Tree(6);
    tree.right.right = new Tree(11);

    TreeUtil treeUtil = new TreeUtil();
    System.out.println(treeUtil.rootSumTree(tree));
  }

}
