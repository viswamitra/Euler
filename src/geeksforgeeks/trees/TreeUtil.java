package geeksforgeeks.trees;

import java.util.ArrayDeque;
import java.util.Queue;

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

  public boolean isBst(Tree root, int min, int max) {
    if(root == null) {
      return false;
    }

    if(root.data > max || root.data < min) {
      return false;
    }

    return isBst(root.left, min, root.data) && isBst(root.right, root.data, max);
  }

  public void levelOrderTraversal(Tree root) {
    if(root == null) {
      return;
    }
    Queue<Tree> queue = new ArrayDeque<>();
    queue.add(root);

    while(! queue.isEmpty()) {
      root = queue.poll();
      System.out.println(root.data);
      if(root.left != null) {
        queue.add(root.left);
      }
      if(root.right != null) {
        queue.add(root.right);
      }
    }
  }

  public Integer lowestCommonAncestor(Tree root, int first, int second) {
    if(root == null) {
      return -1;
    }

    if(root.data >= first && root.data < second) {
      return root.data;
    }

    if(root.data >= first && root.data > second && root.left != null) {
      return lowestCommonAncestor(root.left, first, second);
    }

    if(root.data <= first && root.data < second && root.right != null) {
      return lowestCommonAncestor(root.right, first, second);
    }

    return -1;
  }

  public void topView(Tree root) {
    if(root == null) {
      return;
    }
    if(root.left != null) {
      topViewLeft(root.left);
    }
    System.out.print(root.data+" ");
    if(root.right != null) {
      topViewRight(root.right);
    }
  }

  private void topViewLeft(Tree root) {
    if(root.left != null) {
      topViewLeft(root.left);
    }
    System.out.print(root.data+" ");
  }

  private void topViewRight(Tree root) {
    if(root == null) {
      return;
    }
    System.out.print(root.data+" ");
    if(root.right != null) {
      topViewRight(root.right);
    }
  }
}
