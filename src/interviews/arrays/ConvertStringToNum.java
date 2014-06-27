package interviews.arrays;

/**
 * Created by abhiramk on 24/06/14.
 */
public class ConvertStringToNum {

    public static int convert (String a) {
        char[] arr = a.toCharArray();
        int sum = 0;
        for(int i =0; i< arr.length; i++) {
            sum = sum*10 + (arr[i] - '0');
        }
        return sum;
    }

    public static void main(String[] args) {
        String a = "535";
        System.out.println(convert(a));
    }

}
