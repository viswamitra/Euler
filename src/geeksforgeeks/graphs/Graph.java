package geeksforgeeks.graphs;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by abhiramk on 19/02/16.
 */
public class Graph {
    private int v; // number of vertices
    private List<Integer> adj[]; // an array of adj values, each value is a list.

    public Graph(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for(int i = 0; i< v; i++){
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int s, int d) {
        adj[s].add(d);
    }

}
