package interviews.linkedLists;

/**
 * Created by abhiramk on 17/06/14.
 * Add two linked lists
 */
public class AddLinkedLists {
    public static Node construct1() {
        Node head = new Node(3);
        head.next = new Node(2);
        head.next.next = new Node(1);
        return head;
    }

    public static Node construct2() {
        Node head = new Node(9);
        head.next = new Node(6);
        return head;
    }

    public static Node addLinkedLists(Node list1, Node list2) {
        int carry = 0;
        int sum = 0;
        Node result = null;
        Node curr = null;

        while(list1 != null || list2 != null) {
            sum = (list1!= null ? list1.data : 0) + (list2!= null ? list2.data : 0) + carry;
            if(sum > 10) {
                carry = 1;
            } else {
                carry = 0;
            }
            Node answer = new Node(sum %10);

            if(result == null) {
                result = answer;
                curr = result;
            } else {
                curr.next = answer;
                curr = curr.next;

            }
            if(list1!= null ) list1 = list1.next;

            if(list2 != null) list2 = list2.next;

        }
        return result;

    }



    public static void main(String[] args) {
        Node list1 = construct1();
        Node list2 = construct2();



        Node result = addLinkedLists(list1, list2);
        printList(result);

    }

    private static void printList(Node result) {

        while(result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
    }
}
