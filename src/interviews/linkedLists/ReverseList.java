package interviews.linkedLists;

/**
 * Created by abhiramk on 14/06/14.
 * given a linkedlist and a number n, reverse in chunks
 * eg: 1-2-3-4-5-6, 3
 * 3-2-1-6-5-4
 */
public class ReverseList {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        Node.print(head);
        head = reverse(head, 3);
        Node.print(head);
    }

    private static Node reverse(Node head, int k) {
        Node current = head;
        Node next = null;
        Node prev = null;
        int count = 0;

        while(current != null && count < k ) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        if(next != null) {
            head.next = reverse(next, k);
        }

        return prev;
    }
}
