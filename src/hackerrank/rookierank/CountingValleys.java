package hackerrank.rookierank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by abhiramk on 27/07/16.
 */
public class CountingValleys {
    public static void main(String[] args) throws IOException {
        BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.valueOf(bin.readLine());
        String[] arr = bin.readLine().split("");
        List<Integer> runningSumArray = new ArrayList<>();
        int runningSum = 0;
        for(int i = 0; i< size; i++) {
            if(arr[i].equalsIgnoreCase("U"))
                runningSum += 1;
            if(arr[i].equalsIgnoreCase("D"))
                runningSum += -1;
            runningSumArray.add(runningSum);
        }
        int valleyStart = 0;
        int valleyEnd = 0;
        for(int i =0; i< runningSumArray.size()-1;i++) {
            if(i == 0 && runningSumArray.get(i) == -1)
                valleyStart++;
            if(runningSumArray.get(i) == 0 && runningSumArray.get(i+1) == -1)
                valleyStart++;
            if(runningSumArray.get(i) == -1 && runningSumArray.get(i+1) == 0)
                valleyEnd++;
        }
        System.out.println(Math.min(valleyStart, valleyEnd));


    }
}
