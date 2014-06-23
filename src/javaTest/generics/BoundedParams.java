package javaTest.generics;

/**
 * Created by abhiramk on 16/05/14.
 */
public class BoundedParams {

    public static <T extends Comparable<T>> int countGreaterThan(T[] elements, T item) {
        int count = 0;
        for(T e: elements) {
            if (e.compareTo(item) > 0) {
                ++count;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        BoundedParams boundedParams = new BoundedParams();
        Integer[] elements = new Integer[] {1,2,3,4,5};
        Integer ele = 2;
        System.out.println(boundedParams.countGreaterThan(elements, ele));
    }
}
