package geeksforgeeks.trees;

public class TreeUtilRunner {

  public static void main(String[] args) {
    Tree tree = new Tree(10);
    tree.left = new Tree(-10);
    tree.right = new Tree(30);
    tree.left.right = new Tree(8);
    tree.left.right.left = new Tree(6);
    tree.left.right.right = new Tree(9);
    tree.right.left = new Tree(25);
    tree.right.left.left = new Tree(28);
    tree.right.right = new Tree(60);
    tree.right.right.right = new Tree(78);



    TreeUtil treeUtil = new TreeUtil();
    System.out.println(treeUtil.lowestCommonAncestor(tree, 28, 78));
    System.out.println(treeUtil.lowestCommonAncestor(tree, 6, 9));
    System.out.println(treeUtil.lowestCommonAncestor(tree, 30, 78));
  }

}
