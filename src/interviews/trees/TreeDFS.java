package interviews.trees;

import java.util.ArrayList;
import java.util.List;

import static jdk.nashorn.internal.objects.Global.print;

/**
 * Created by abhiram on 20/9/16.
 */
public class TreeDFS {
    public void recur(Tree root, List<Integer> result) {
        if(root == null)
            return;

        //System.out.print(root.data+" ");
        result.add(root.data);
        if(root.left == null && root.right == null) {
            printAr(result);

        } else {
            recur(root.left, result);
            recur(root.right, result);
        }





    }

    private void printAr(List<Integer> result) {
        for(Integer i : result) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public void printTreeDFS(Tree root) {
        List<Integer> result = new ArrayList<>();
        recur(root, result);
    }

    public static void main(String[] args) {
        TreeDFS treeDFS = new TreeDFS();
        Tree root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);
        root.right.right = new Tree(6);
        treeDFS.printTreeDFS(root);

    }

}
