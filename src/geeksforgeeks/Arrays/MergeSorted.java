package geeksforgeeks.Arrays;

public class MergeSorted {

  public static void main(String[] args) {
    int[] a1 = {1};
    int[] a2 = {2,4,6,8,10};

    int resLen = a1.length + a2.length;

    int[] res = new int[resLen];

    int i = 0, j = 0;
    int resC = 0;

    while (i < a1.length && j < a2.length) {
      if(a1[i] < a2[j]) {
        res[resC] = a1[i];
        i++;
        resC++;
      } else {
        res[resC] = a2[j];
        j++;
        resC++;
      }
    }

    while(i < a1.length) {
      res[resC++] = a1[i++];
    }

    while(j < a2.length) {
      res[resC++] = a2[j++];
    }

    for(int k = 0; k < res.length; k++) {
      System.out.print(res[k]+" ");
    }
    System.out.println();


  }
}
