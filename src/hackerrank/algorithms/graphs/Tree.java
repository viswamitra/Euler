package hackerrank.algorithms.graphs;

import java.util.ArrayList;
import java.util.List;

public class Tree {
  private List<Tree> children;
  private int data;

  public void setWeight(int weight) {
    this.weight = weight;
  }

  private int weight;

  public int getWeight() {
    return weight;
  }

  private boolean visited;

  public List<Tree> getChildren() {
    return children;
  }

  public Tree(int data) {
    this.data = data;
    this.weight = 0;
    children = new ArrayList<>();
  }

  public void addChild(Tree childTree) {
    children.add(childTree);
  }

  public void printTreeDFS(Tree tree) {
    tree.visited = true;
    System.out.println(tree.data);

    for(Tree child : tree.getChildren()) {
      if(!child.visited)
        printTreeDFS(child);
    }

  }

  public int addWeights(Tree tree) {
    if(tree.getChildren().size() == 0) {
      return 1;
    } else {
      int sum = 1;
      for(Tree child : tree.getChildren()) {
        sum += addWeights(child);
      }
      return sum;
    }
  }

}
