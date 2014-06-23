package interviews.amazon;

/**
 * Created by abhiramk on 24/05/14.
 */
class Tree {
    Tree left, right;
    int data;

    public Tree(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class ArrayToBST {

    public static Tree sortedArraytoBST(int[] arr, int start, int end) {
        if(start > end) {
            return null;
        }

        int mid = (start + end)/2;
        Tree root = new Tree(mid);
        root.left = sortedArraytoBST(arr, start, mid-1);
        root.right = sortedArraytoBST(arr, mid+1, end);
        return root;
    }

    public static void printInorder(Tree tree) {
        if(tree == null) {
            return;
        }
        printInorder(tree.left);
        System.out.println(tree.data);
        printInorder(tree.right);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int n = arr.length;

        Tree convertedTree = ArrayToBST.sortedArraytoBST(arr, arr[0], arr[n-1]);
        printInorder(convertedTree);
    }


}
