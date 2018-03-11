package hackerrank.datastructures.trees;

public class InsertBst {

  public Tree insertBst(Tree mainRoot, Tree root, int data) {
    if(root == null) {
      Tree node = new Tree(data);
      return node;
    }


    if(data < root.data) {
      if(root.left == null) {
        root.left = new Tree(data);
        return mainRoot;
      }
      return insertBst(mainRoot, root.left, data);
    }

    if(data > root.data) {
      if(root.right == null) {
        root.right = new Tree(data);
        return mainRoot;
      }
      return insertBst(mainRoot, root.right, data);
    }

    return mainRoot;

  }

  public static void main(String[] args) {
    Tree tree = new Tree(4);
    tree.left = new Tree(2);
    tree.left.left = new Tree(1);
    tree.left.right = new Tree(3);
    tree.right = new Tree(7);

    InsertBst insertBst = new InsertBst();
    Tree root = insertBst.insertBst(tree, tree, 6);
    System.out.println(root.data);


  }
}
