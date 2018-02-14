package hackerrank.algorithms.graphs;

public class TreeTest {

  public static void main(String[] args) {
    Tree tree = new Tree(1);
    Tree tree2 = new Tree(2);
    Tree tree3 = new Tree(3);
    Tree tree4 = new Tree(4);
    Tree tree5 = new Tree(5);
    Tree tree6 = new Tree(6);
    Tree tree7 = new Tree(7);
    Tree tree8 = new Tree(8);
    Tree tree9 = new Tree(9);
    Tree tree10 = new Tree(10);

    tree.addChild(tree2);
    tree.addChild(tree3);
    tree.addChild(tree6);

    tree2.addChild(tree7);
    tree2.addChild(tree5);

    tree6.addChild(tree8);

    tree8.addChild(tree9);
    tree8.addChild(tree10);

    tree3.addChild(tree4);

//    tree.printTreeDFS(tree);

    int result = tree.addWeights(tree3);
    System.out.println(result);





  }
}
