package interviews.graphs;

/**
 * Created by abhiramk on 15/03/14.
 */
public class GraphClient {

    public static int degree(Graph g, int v) {
        int degree = 0;
        for(int w: g.adj(v)) {
            degree++;
        }
        return degree;
    }

    public static int maxDegree(Graph g) {
        int maxDegree = 0;
        for(int v = 0; v<g.V(); v++) {
            if(degree(g, v) > maxDegree) {
                maxDegree = degree(g,v);
            }
        }
        return maxDegree;
    }


}
