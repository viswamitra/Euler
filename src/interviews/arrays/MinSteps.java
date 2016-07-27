package interviews.arrays;

import java.util.ArrayList;

/**
 * Created by abhiramk on 21/07/16.
 */
public class MinSteps {

        // X and Y co-ordinates of the points in order.
        // Each point is represented by (X.get(i), Y.get(i))
        public static int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
            int x_dist = 0;
            int y_dist = 0;
            int totalDist = 0;

            for(int i =0; i< X.size()-1; i++) {
                    int x = X.get(i);
                    int y = Y.get(i);
                    int x1 = X.get(i+1);
                    int y1=  Y.get(i+1);
                x_dist = Math.abs(x1-x);
                y_dist = Math.abs(y1-y);
                if(x_dist>= y_dist)
                    totalDist += x_dist;
                else
                    totalDist += y_dist;
            }
            return totalDist;

    }


    public static void main(String[] args) {
        ArrayList<Integer> X = new ArrayList<>();
        ArrayList<Integer> Y = new ArrayList<>();
        X.add(1);
        X.add(0);
        X.add(4);
//        X.add(1);

        Y.add(3);
        Y.add(4);
        Y.add(3);
//        Y.add(4);

        int a = coverPoints(X,Y);
        System.out.println(a);


    }
}
