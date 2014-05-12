package Utils;

import java.util.*;

import static java.util.Arrays.sort;

public class Utils {
	public static String reverse(String a) {
		if(a.length() == 0) return "";
		return a.charAt(a.length()-1) + reverse(a.substring(0, a.length()-1));
	}
	
	public static void main(String[] args) {
       String a = "abhiram";
       char[] b = a.toCharArray();
       sort(b);
        System.out.println(b);


    }
}
