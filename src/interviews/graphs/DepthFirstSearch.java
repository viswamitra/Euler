package interviews.graphs;

/**
 * Created by abhiramk on 17/03/14.
 */
public class DepthFirstSearch {

    private boolean[] marked;
    private int count;

    public DepthFirstSearch(Graph g, int v) {
        marked = new boolean[g.V()];
        dfs(g, v);
    }

    private void dfs(Graph g, int v) {
        marked[v] = true;
        count++;
        for(int w : g.adj(v)) {
            if(!marked[w]) dfs(g, w);
        }
    }

    public boolean marked(int w) {
        return marked[w];
    }

    public int count(){
        return count;
    }
}
