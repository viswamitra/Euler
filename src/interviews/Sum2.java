package interviews;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by abhiramk on 27/09/15.
 */
public class Sum2 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int totalCount = 0;
        int sum = Integer.parseInt(in.readLine());
        int cases = Integer.parseInt(in.readLine());
//        List<Integer> listInt = new ArrayList<>();
        int[] listInt = new int[cases];
        for (int i = 0; i < cases; i++) {
//            listInt.add(i, Integer.parseInt(in.readLine()));
              listInt[i] = Integer.parseInt(in.readLine());
        }

        for (int i = 0; i < cases; i++) {
            for(int j = i+1; j< cases; j++) {
//                if (sum == listInt.get(i) + listInt.get(j))
                if (sum == listInt[i] + listInt[j])
                    totalCount++;
            }
        }


        System.out.println(totalCount/2);

    }
}
