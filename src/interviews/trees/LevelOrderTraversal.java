package interviews.trees;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by abhiramk on 25/06/14.
 */
public class LevelOrderTraversal {

    public static Tree construct() {
        Tree root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);
        return root;
    }

    public static void printLevelOrderTraversal(Tree root) {
        if(root == null) {
            return;
        }


        Queue<Tree> q = new ArrayBlockingQueue<Tree>(100);
        q.add(root);

        while(!q.isEmpty()) {
            Tree currNode = q.poll();
            System.out.println(currNode.data+"-");
            if(currNode.left != null)
                q.add(currNode.left);
            if(currNode.right != null)
                q.add(currNode.right);
        }
    }


    public  static void main(String[] args) {
        Tree root = construct();
        printLevelOrderTraversal(root);
    }
}
