package hackerrank.datastructures.strings;

import java.util.Scanner;
import java.util.Stack;

public class SuperReducedString {

  static String super_reduced_string(String s){
    String[] sp = s.split("");
    Stack<String> stak = new Stack<>();
    for(int i = 0; i < sp.length; i++) {
      if(stak.size() == 0) {
        stak.push(sp[i]);
      } else {
        String peek= stak.peek();
        if(peek.equalsIgnoreCase(sp[i])) {
          stak.pop();
        } else {
          stak.push(sp[i]);
        }
      }
    }

    String result = "";
    if(stak.size() == 0) {
      result += "Empty String";
    }
    else {
      for(String i : stak) {
        result +=i;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.next();
    String result = super_reduced_string(s);
    System.out.println(result);
  }
}
