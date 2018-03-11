package hackerrank.datastructures.linkedlists;

/**
 * Created by abhiramk on 16/03/16.
 */
public class LinkedList {

    public static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }

    }

    public void print(Node head) {
        if (head == null){
            return;
        } else {
            while(head.next != null) {
                System.out.println(head.data);
                head = head.next;
            }
        }

    }
}
