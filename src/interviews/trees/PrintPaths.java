package interviews.trees;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abhiramk on 31/05/14.
 */
public class PrintPaths {

    public Tree construct() {
        Tree root = new Tree(10);
        root.left = new Tree(8);
        root.left.left = new Tree(3);
        root.left.right = new Tree(5);
        root.right = new Tree(2);
        root.right.left = new Tree(2);
        return root;
    }

    public void printPaths(Tree root) {
        List<Integer> list = new ArrayList<Integer>();
        printPathsRecursive(root, list);
    }

    private void printPathsRecursive(Tree root, List<Integer> list) {
        if(root == null)
            return;
        list.add(root.data);
        if(root.left == null && root.right == null) {
            printList(list);
        } else {
            printPathsRecursive(root.left, list);
            printPathsRecursive(root.right, list);
        }

    }

    private void printList(List<Integer> list) {
        for(Integer i : list) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        PrintPaths client = new PrintPaths();

    }
}
