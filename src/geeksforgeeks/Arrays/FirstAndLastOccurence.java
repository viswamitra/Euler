package geeksforgeeks.Arrays;

/**
 * https://practice.geeksforgeeks.org/problems/find-first-and-last-occurrence-of-x/0
 */

public class FirstAndLastOccurence {

  public void firstAndLast(int[] list, int num) {
    int firstA = first(list, num, 0, list.length -1);
    int lastA = last(list, num, 0, list.length-1);
    System.out.println(firstA);
    System.out.println(lastA);
  }

  private int last(int[] list, int num, int first, int last) {
    if(first <= last) {
      int mid = (first + last) / 2;
      if(mid == list.length -1 || list[mid+1] > num && list[mid] == num) {
        return mid;
      } else if (num < list[mid]) {
        return first(list, num, first, mid-1);
      } else {
        return first(list, num, mid+1, last);
      }
    }
    return -1;
  }

  private int first(int[] list, int num, int first, int last) {
    if(first <= last) {
      int mid = (first + last) / 2;
      if(mid == 0 || list[mid-1] < num && list[mid] == num) {
        return mid;
      } else if (num > list[mid]) {
        return first(list, num, mid+1, last);
      } else {
        return first(list, num, first, mid-1);
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] list = new int[] {1, 2, 3, 3, 3, 3, 5};
    FirstAndLastOccurence sol = new FirstAndLastOccurence();
    int num = 3;
    sol.firstAndLast(list, num);
  }
}
