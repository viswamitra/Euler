package geeksforgeeks.SearchSort;

/**
 * Find the frequency of the element in a sorted array.
 * Input: {1, 2, 2, 2, 3, 4, 5}
 * Key: 2
 * Output: 3
 */
public class FreqElement {

  public static void main(String[] args) {
    int[] inp = {1, 2, 2, 2, 3, 4, 5};
    int key = 2;
    int output = count(inp, key, inp.length);
    System.out.println(output);
  }

  private static int count(int[] inp, int key, int n) {
    int i = first(inp, 0, n-1, key, n);
    int j = last(inp, i, n-1, key, n);
    return j-i+1;
  }

  private static int last(int[] inp, int low, int high, int key, int n) {
    if(low <= high) {
      int mid = (low + high)/2;
      if(mid == 0 || inp[mid] == key && inp[mid+1] > key) {
        return mid;
      }else if (inp[mid] > key) {
        return last(inp, low, mid-1, key, n);
      } else {
        return last(inp, mid+1, high,key, n);
      }
    }
    return -1;
  }

  private static int first(int[] inp, int low, int high, int key, int n) {
    if(low <= high) {
      int mid = (low + high)/2;
      if(mid == 0 || inp[mid] == key && inp[mid-1] < key) {
        return mid;
      }else if (inp[mid] < key) {
        return first(inp, mid+1, high, key, n);
      } else {
        return first(inp, low, mid-1,key, n);
      }
    }
    return -1;
  }
}
