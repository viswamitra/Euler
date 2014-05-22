package interviews.atlassian.tree.iteration;

import java.util.Queue;

/**
 * Created by abhiramk on 16/05/14.
 */
public interface Folder<T, U>
{
    U fold(U u, Queue<T> list, Function2<T,U,U> function);
}
