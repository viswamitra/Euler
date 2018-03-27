package geeksforgeeks.LinkedLists;

public class LinkedListUtils {

  public int detectLoop(Node head) {
    Node slow = head;
    Node fast = head;
    while(slow != null && fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

      if(slow == fast) {
        return 1;
      }
    }
    return 0;
    
  }
}
