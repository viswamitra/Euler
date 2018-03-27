package geeksforgeeks.graphs;

import java.util.LinkedList;
import java.util.List;

public class Graph {

  Integer vertices;
  List<Integer> adj[];

  public Graph(Integer v) {
    this.vertices = v;
    adj = new LinkedList[vertices];
    for(int i = 0; i < v; i++) {
      adj[i] = new LinkedList<>();
    }
  }

  public void addEdge(int u, int w) {
    adj[u].add(w);
  }

  public List<Integer> getAdj(int v) {
    return adj[v];
  }

  public Integer getVertices() {
    return this.vertices;
  }
}
