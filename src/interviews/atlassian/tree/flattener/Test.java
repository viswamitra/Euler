package interviews.atlassian.tree.flattener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abhiramk on 18/05/14.
 */
public class Test {

    public Tree<Integer> contruct() {
        Tree<Integer> child1 = new Tree.Leaf<Integer>(1);
        Tree<Integer> child6 = new Tree.Leaf<Integer>(6);
        Tree<Integer> child5 = new Tree.Leaf<Integer>(5);
        Tree<Integer> child4 = new Tree.Leaf<Integer>(4);
        Tree<Integer> child9 = new Tree.Leaf<Integer>(9);
        Tree<Integer> middle = new Tree.Node<Integer>(child5, child4, child9);
        Tree<Integer> root = new Tree.Node<Integer>(child1, middle, child6);

        return root;
    }

    public static void main(String[] args) {
        Test client = new Test();
        MyFlattenTree<Integer> flattenTree = new MyFlattenTree<Integer>();
        Tree<Integer> rootNode = client.contruct();
        List<Integer> list = flattenTree.flattenInOrder(rootNode);

        System.out.println("------>"+list.size());
        for(Integer e : list) {
            System.out.println(e);
        }






    }

}
