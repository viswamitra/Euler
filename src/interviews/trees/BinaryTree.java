package interviews.trees;

/**
 * Created by abhiramk on 25/04/14.
 */

class Node {
    Node left;
    Node right;
    int data;

    Node(int newData) {
        left = null;
        right = null;
        data = newData;
    }
}
public class BinaryTree {

    // root node, will be null for an empty tree.
    public Node root;

    public Node getRoot() {
        return root;
    }



    // creates a new binary tree
    public void BinaryTree() {
        root = null;
    }

    // check if a given node is in a binary tree
    public boolean lookUp(int data) {
        return lookUp(root, data);
    }

    private boolean lookUp(Node node, int data) {
        if(node== null)
            return false;
        if(node.data == data)
            return true;
        else if (node.data < data) {
            return (lookUp(node.left, data));
        } else {
            return (lookUp(node.right, data));
        }
    }

}
