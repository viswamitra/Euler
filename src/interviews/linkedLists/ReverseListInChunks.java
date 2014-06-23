package interviews.linkedLists;

/**
 * Created by abhiramk on 19/06/14.
 */
public class ReverseListInChunks {

    public static Node construct() {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        return head;
    }

    public static void printList(Node head) {
        while(head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node head = construct();
        Node reverseHead = reverseInChunks(head);
        printList(reverseHead);
    }

    private static Node reverseInChunks(Node head) {
        if(head == null || head.next == null) {
            return head;
        }

        Node curr = head;
        Node next = null;
        Node prev = null;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
