package interviews.trees;

import interviews.trees.Tree;

/**
 * Created by abhiramk on 10/05/14.
 */
public class BinaryTreeClient {

    private Tree node;
    public Tree construct() {
        node = new Tree(1);
        node.left = new Tree(2);
        node.right = new Tree(3);
        node.left.right = new Tree(4);
        return node;
    }

    public void printInorder(Tree root) {
        if (root == null) {
            return;
        }
        printInorder(root.left);
        System.out.println(root.data);
        printInorder(root.right);
    }

    public static void main(String[] args) {

        BinaryTreeClient client = new BinaryTreeClient();
        Tree node = client.construct();
        client.printInorder(node);



    }
}
