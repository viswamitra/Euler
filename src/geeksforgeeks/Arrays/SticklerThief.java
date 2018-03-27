package geeksforgeeks.Arrays;

/**
 * https://practice.geeksforgeeks.org/problems/stickler-theif/0
 */
public class SticklerThief {

  public int maximize(int[] list, int start, int end) {
    if(start+1 == end) {
      return Math.max(list[start], list[end]);
    }
    int first = list[start] + maximize(list, start+2, end);
    int second = maximize(list, start+1, end);
    return Math.max(first, second);
  }

  public static void main(String[] args) {
    int[] list = new int[] {5, 5, 10, 100, 10, 5};
    SticklerThief sol = new SticklerThief();
    System.out.println(sol.maximize(list, 0, list.length-1));
  }
}
