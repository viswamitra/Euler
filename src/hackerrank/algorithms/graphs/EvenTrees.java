package hackerrank.algorithms.graphs;

import java.util.Scanner;

public class EvenTrees {

  static int evenTree(int n, int m, int[][] tree) {
    return 0;
  }

  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int m = in.nextInt();
      int[][] tree = new int[m][2];
      for(int tree_i = 0; tree_i < m; tree_i++){
        for(int tree_j = 0; tree_j < 2; tree_j++){
          tree[tree_i][tree_j] = in.nextInt();
        }
      }
      int result = evenTree(n, m, tree);
      System.out.println(result);
      in.close();
    }
  }

