package interviews.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class NobleInteger {

  public int solve(ArrayList<Integer> Ap) {
    Set<Integer> aD = new HashSet<>();
    aD.addAll(Ap);
    ArrayList<Integer> A = new ArrayList<>();
    A.addAll(aD);
    A.sort(Comparator.naturalOrder());
    Map<Integer, Integer> count = new HashMap<>();
    for(int i = 0; i < A.size()-1; i++) {
      if(A.get(i+1) > A.get(i)) {
        if(count.get(A.get(i)) == null) {
          count.put(A.get(i), A.size() - (i+1));
        }
      }
    }

    final int[] ret = {0};
    count.forEach((k, v) -> {
      if(Math.abs(k) == Math.abs(v)) {
        ret[0] = 1;
      }

    });
    if(ret[0] == 1) {
      return 1;
    } else {
      return -1;
    }
  }

  public static void main(String[] args) {
    Integer[] inp = new Integer[] {1, 2, 7, 0, 9, 3, 6, 0, 6};

    List<Integer> integers = Arrays.asList(inp);
    integers.sort(Comparator.naturalOrder());
    System.out.println(new NobleInteger().solve(new ArrayList<>(integers)));

  }
}
