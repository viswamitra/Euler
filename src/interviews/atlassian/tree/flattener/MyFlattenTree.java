package interviews.atlassian.tree.flattener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abhiramk on 16/05/14.
 */
public class MyFlattenTree<T> implements FlattenTree<T> {

    public List<T> flattenInOrder(Tree<T> tree) {
        if (tree == null) {
            throw new IllegalArgumentException();
        }
        List<T> list = new ArrayList<T>();
        recursiveInorder(tree, list);
        return list;
    }

    private void recursiveInorder(Tree<T> tree, List<T> list) {
        if(tree.get().isLeft()) {


            // this means this is a child node,
            // then add it to the list
            list.add(tree.get().ifLeft(new ThirdFunction<T>()));
            return;

        }
        else {
            /**
             * get the nodes of the trees,
             * and apply this method recursively
             * on tree.left, tree.middle, tree.right
             */

            Triple<Tree<T>> nodes = tree.get().ifRight(new ThirdFunction<Triple<Tree<T>>>());
            recursiveInorder(nodes.left(), list);
            recursiveInorder(nodes.middle(), list);
            recursiveInorder(nodes.right(), list);
        }
    }

    public class LeafFunction implements Function<T,T> {
        @Override
        public T apply(T t) {
            return t;
        }
    }

    public class NodeFunction implements Function<Triple<Tree<T>> , Triple<Tree<T>>> {

        @Override
        public Triple<Tree<T>> apply(Triple<Tree<T>> treeTriple) {
            return treeTriple;
        }
    }

    public class ThirdFunction<A> implements Function<A,A> {
        @Override
        public A apply(A t) {
            return t;
        }
    }
}









