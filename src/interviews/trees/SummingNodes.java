package interviews.trees;

/**
 * Created by abhiramk on 22/07/14.
 */
class SumTree {
    SumTree left;
    SumTree right;
    char name;

    SumTree(char newData) {
        left = null;
        right = null;
        name = newData;
    }
}

public class SummingNodes {

    public static SumTree contruct(){
        SumTree root = new SumTree('A');
        root.left = new SumTree('B');
        root.right = new SumTree('C');
        root.left.left = new SumTree('D');
        return root;
    }

    public static int sumSalary(SumTree root) {
        if(root == null) {
            return 0;
        }
        int sum = 0;
        sum += sumSalary(root.left) + sumSalary(root.right) + 1;

        return sum;
    }

    public static void main(String[] args) {
        SumTree root = contruct();
        System.out.println(sumSalary(root));
    }

}
