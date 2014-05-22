package interviews.atlassian.tree.flattener;

import java.util.List;

/**
 * Created by abhiramk on 16/05/14.
 */
public interface FlattenTree<T> {

    /**
     *
     * @param tree the Tree to flatten
     * @return a list containing all the leaf values in t, in left-to-right order
     * @throws IllegalArgumentException if t is null
     */
    List<T> flattenInOrder(Tree<T> tree);

}

