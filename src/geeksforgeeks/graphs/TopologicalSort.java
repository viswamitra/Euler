package geeksforgeeks.graphs;

public class TopologicalSort {
  public static void main(String[] args) {
    Graph g = new Graph(6);
    g.addEdge(3, 0);
    g.addEdge(3, 4);
    g.addEdge(0, 1);
    g.addEdge(1, 2);
    g.addEdge(4, 5);
    g.addEdge(5, 3);

    DetectCycleInDAG dag = new DetectCycleInDAG(g);
    dag.hasCycle(g);
  }
}