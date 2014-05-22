package interviews.atlassian.tree.iteration;

import java.util.Queue;

/**
 * Created by abhiramk on 16/05/14.
 */
public class MyFolder<T, U> implements Folder<T, U>
{
    public U fold(U u, Queue<T> ts, Function2<T, U, U> function)
    {
        if(u == null || ts == null || function == null)
            throw new IllegalArgumentException();

        do {
            if (ts.isEmpty()) {
                return u;
            } else {
                u = function.apply(ts.poll(), u);
            }


        } while(true);


        // The recursive implementation will overflow the stack for
        // any data set of real size, your job is to implement a
        // non-recursive solution
//        return fold(function.apply(ts.poll(), u), ts, function);
//        /return null;
    }
}