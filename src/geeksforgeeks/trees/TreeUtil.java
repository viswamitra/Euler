package geeksforgeeks.trees;

public class TreeUtil {

  public Tree insert(Tree root,int data) {
    if(root == null) {
      return new Tree(data);
    }

    if(root.data == data) {
      return root;
    }
    if(root.data > data) {
      return insert(root.left, data);
    } else {
      return insert(root.right, data);
    }
  }

  public boolean isSame(Tree tree1, Tree tree2) {
    if(tree1 == null && tree2 == null) {
      return true;
    }

    if(tree1.data == tree2.data && isSame(tree1.left, tree2.left) && isSame(tree1.right, tree2.right)) {
      return true;
    }
    else {
      return false;
    }
  }

  public Tree isPresent(Tree root,int data) {
    if(root == null) {
      return null;
    }
    if(root.data == data) {
      return root;
    }
    if(root.data > data) {
      return isPresent(root.left, data);
    } else {
      return isPresent(root.right, data);
    }
  }

  public Integer size(Tree root) {
    if(root == null) {
      return 0;
    }
    if(root.left == null && root.right == null) {
      return 1;
    }
    return 1 + size(root.left) + size(root.right);
  }

  public Integer height(Tree root) {
    if(root == null) {
      return 0;
    }
    return 1 + Math.max(height(root.left), height(root.right));
  }

  public Integer rootSumTree(Tree root) {
    if(root == null) {
      return 0;
    }
    return root.data + rootSumTree(root.left) + rootSumTree(root.right);
  }
}
