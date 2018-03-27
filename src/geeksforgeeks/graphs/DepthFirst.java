package geeksforgeeks.graphs;

public class DepthFirst {

  private Graph3 g;

  public DepthFirst(int v) {
    g = new Graph3(v);
  }

  public Graph3 getG() {
    return g;
  }

  public void depthFirstSearch(int startingVertex) {
    boolean[] visited = new boolean[g.getV()];
    dfsUtil(startingVertex, visited);
  }

  private void dfsUtil(int startingVertex, boolean[] visited) {
    visited[startingVertex] = true;
    System.out.println(startingVertex+ "-");
    for(Integer adjacent : g.getAdjacents(startingVertex)) {
      if(visited[adjacent] != true) {
        dfsUtil(adjacent, visited);
      }
    }
  }

  public static void main(String[] args) {
    DepthFirst depthFirst = new DepthFirst(4);
    Graph3 g = depthFirst.getG();
    g.addEdge(2, 0);
    g.addEdge(2, 3);
    g.addEdge(0, 2);
    g.addEdge(0, 1);
    g.addEdge(1, 2);

    depthFirst.depthFirstSearch(2);
  }
}
