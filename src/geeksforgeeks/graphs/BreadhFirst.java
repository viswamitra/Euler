package geeksforgeeks.graphs;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by abhiramk on 15/02/16.
 */
public class BreadhFirst {

    private boolean[] visited;

    public BreadhFirst(int v) {
        visited = new boolean[v];
    }
    public void bfs(int s) {
        //mark the current vertex - source as visited.
        visited[s] = true;

        //create a queue.
        Queue<Integer> queue = new ArrayDeque<>();

        //add the first element into the queue
        queue.add(s);

        //while the queue is not empty
        while (!queue.isEmpty()) {
            //dequeue an element from the queue, and print it
            int e = queue.poll();
            System.out.print(e+" ");


        }
    }

    public static void main(String[] args) {
        BreadhFirst breadhFirst = new BreadhFirst(4);
        Graph g = new Graph(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(3,3);
    }

}
