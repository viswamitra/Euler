package geeksforgeeks.graphs;

import java.util.HashSet;
import java.util.Set;

public class DetectCycleInDAG {

  private Graph g;

  public DetectCycleInDAG(Graph g) {
    this.g = g;
  }
  public boolean hasCycle(Graph g) {
    Set<Integer> white = new HashSet<>();
    Set<Integer> black = new HashSet<>();
    Set<Integer> gray = new HashSet<>();

    for(int i = 0; i < g.getVertices(); i++) {
      white.add(i);
    }

    while(white.size() > 0) {
      Integer current = white.iterator().next();
      if (hasCycleUtil(current, white, black, gray)) {
        return true;
      }
    }
    return false;
  }

  private boolean hasCycleUtil(Integer current, Set<Integer> white, Set<Integer> black, Set<Integer> gray) {
    moveVertex(current, white, gray);
    for(Integer adjacent : g.getAdj(current)) {
      if(black.contains(adjacent))
        continue;
      if(gray.contains(adjacent)) {
        return true;
      }
      if(hasCycleUtil(adjacent, white, black, gray)) {
        return true;
      }
    }
    moveVertex(current, gray, black);
    return false;
  }

  private void moveVertex(Integer current, Set<Integer> white, Set<Integer> gray) {
    white.remove(current);
    gray.add(current);
  }

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
