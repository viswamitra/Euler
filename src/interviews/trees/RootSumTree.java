package interviews.trees;

/**
 * Created by abhiramk on 19/06/14.
 */
public class RootSumTree {

    public static Tree construct() {
        Tree root = new Tree(8);
        root.left = new Tree(5);
        root.right = new Tree(3);
        root.left.left = new Tree(2);
        return root;
    }

    public static boolean isRootSumTree(Tree root) {
        if(root == null ) {
            return true;
        }

        if(root.left == null && root.right == null)
            return true;


        return (root.data == ((root.left != null ? root.left.data : 0) + (root.right != null ? root.right.data : 0)) &&
                isRootSumTree(root.left) &&
                isRootSumTree(root.right));

    }

    public static void main(String[] args) {
        Tree node = construct();
        System.out.println(isRootSumTree(node));
    }
}
