package interviews.arrays;

/**
 * Created by abhiramk on 17/06/14.
 * An element is rotated by some amount,
 * [5,6,7,1,2,3,4]
 * find an element in it
 */
public class FindElementInSortedList {
    public static void main(String[] args) {
        int[] a = {5,6,1,2,3,4};
        System.out.println(search(a, 4));

    }

    private static int search(int[] a, int ele) {
         int index = findPivotElementIndex(a, 0, a.length-1);
        System.out.println(index);
        if(ele == a[index]) {
            return index;
        }
        if(ele >= a[0]) {
             return (binarySearch(a, 0, index-1, ele));
         } else {
             return (binarySearch(a, index+1, a.length-1, ele));
         }

    }

    private static int findPivotElementIndex(int[] a, int low, int high) {
        if(high < low)
            return -1;
        if(high == low)
            return low;
        int mid = (low+high)/2;
        if(mid < high && a[mid]> a[mid+1])
            return mid;
        if(mid > low && a[mid]< a[mid-1])
            return mid-1;
        if(a[low] > a[mid]) {
            return findPivotElementIndex(a, low, mid-1);
        } else {
            return findPivotElementIndex(a, mid+1, high);
        }


    }

    private static int binarySearch(int[] a, int low, int high, int ele) {
        if(high < low)
            return -1;
        int mid = (low+high)/2;
        if(ele == mid)
            return mid;
        if(ele > a[mid]) {
            return binarySearch(a, mid+1, high, ele);
        } else {
            return binarySearch(a, low, mid-1, ele);
        }
    }
}
