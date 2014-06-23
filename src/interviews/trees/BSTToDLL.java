package interviews.trees;

/**
 * Created by abhiramk on 17/06/14.
 */
public class BSTToDLL {

    public static Tree contruct(){
        Tree root = new Tree(10);
        root.left = new Tree(12);
        root.right = new Tree(15);
        root.left.left = new Tree(25);
        root.left.right= new Tree(30);
        root.right.left = new Tree(36);
        return root;
    }

    public static Tree binaryTreeToDLL(Tree tree) {
        if(tree == null)
            return tree;

        Tree root = binaryTreeToDLLUtil(tree);

        while(root.left != null) {
            root = root.left;
        }

        return root;
    }

    private static Tree binaryTreeToDLLUtil(Tree root) {
        if(root == null)
            return root;

        if(root.left != null) {
            Tree leftTree = binaryTreeToDLLUtil(root.left);

            while(leftTree.right != null) {
                leftTree = leftTree.right;
            }

            leftTree.right = root;
            root.left = leftTree;
        }

        if(root.right != null) {
            Tree rightTree = binaryTreeToDLLUtil(root.right);

            while(rightTree.left != null) {
                rightTree = rightTree.left;
            }

            rightTree.left = root;
            root.right = rightTree;
        }
        return root;
    }



    public static void main(String[] args) {
        Tree root = contruct();
        Tree.printInorder(root);
        System.out.println("hello");
        Tree dllRoot = binaryTreeToDLL(root);

        while(dllRoot != null){
            System.out.println(dllRoot.data);
            dllRoot = dllRoot.right;

        }


    }


}
