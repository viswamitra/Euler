package interviews.trees;

/**
 * Created by abhiramk on 17/06/14.
 */
public class LCABinarySearchTree {

    public static Tree construct() {
        Tree root = new Tree(20);
        root.left = new Tree(8);
        root.right = new Tree(22);
        root.left.left = new Tree(4);
        root.left.right = new Tree(12);
        root.left.right.left = new Tree(10);
        root.left.right.right = new Tree(14);
        return root;
    }
    public static Tree LCA(Tree root, int n1, int n2) {
        if(root == null) {
            return null;
        }



        if(root.data > n1 && root.data > n2) {
            return LCA(root.left, n1, n2);
        }
        if(root.data < n1 && root.data < n2) {
            return LCA(root.right, n1, n2);
        }

        return root;

    }

    public static void main(String[] args) {
        Tree root = construct();
        Tree lcaNode = LCA(root,14,8);
        System.out.println(lcaNode.data);
    }
}
