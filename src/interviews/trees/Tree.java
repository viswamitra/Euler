package interviews.trees;

/**
 * Created by abhiramk on 25/04/14.
 */

public class Tree {
    Tree left;
    Tree right;
    int data;

    Tree(int newData) {
        left = null;
        right = null;
        data = newData;
    }

    public static void printInorder(Tree root) {
        if(root == null) {
            return;
        }
        printInorder(root.left);
        System.out.println(root.data);
        printInorder(root.right);
    }

}



