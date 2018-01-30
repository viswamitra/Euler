package geeksforgeeks.graphs;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by abhiramk on 19/02/16.
 */
public class Graph {

  private int v;

  public int getV() {
    return v;
  }

  public void setV(int v) {
    this.v = v;
  }

  private LinkedList<Integer> adj[];

  public Graph(int v) {
    this.v = v;
    adj = new LinkedList[v];
    for(int i = 0; i < v; i++) {
      adj[i] = new LinkedList<>();
    }
  }

  public void addEdge(int v, int w) {
    adj[v].add(w);
  }

  public List<Integer> getAdjacents(int v) {
    return adj[v];
  }

}
