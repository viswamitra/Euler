package interviews.trees;

import interviews.trees.BinaryTree;

/**
 * Created by abhiramk on 10/05/14.
 */
public class BinaryTreeClient {

    private Node node;
    public Node construct() {
        node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.right = new Node(4);
        return node;
    }

    public void printInorder(Node root) {
        if (root == null) {
            return;
        }
        printInorder(root.left);
        System.out.println(root.data);
        printInorder(root.right);
    }

    public static void main(String[] args) {

        BinaryTreeClient client = new BinaryTreeClient();
        Node node = client.construct();
        client.printInorder(node);



    }
}
