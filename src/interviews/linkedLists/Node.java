package interviews.linkedLists;

/**
 * Created by abhiramk on 14/06/14.
 */
public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }

    public void push(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public static void print(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}
