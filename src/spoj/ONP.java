package spoj;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Return the Infix form of a given expression.
 * Input:
 * (a+(b*c))
 * Output:
 * abc*+
 * Created by abhiram on 14/9/16.
 */
public class ONP {
    public void meth(String input) {
        char[] inp = input.toCharArray();
        List<Character> inputCharList = new ArrayList<Character>();
        for(int i = 0; i< inp.length; i++) {
            inputCharList.add(Character.valueOf(inp[i]));
        }
        Deque<Character> stack = new ArrayDeque<Character>();
        Queue<Character> queue = new LinkedList<>();
        for(Character c : inputCharList) {
            if(c == '(' || c == '+' || c == '*' || c == '-' || c == '/' || c == '^') {
                stack.push(c);
            }

            else if(c == ')') {
                while (true) {
                    if(stack.peek() != '(') {
                        queue.add(stack.poll());
                    } else {
                        stack.pop();
                        break;
                    }
                }
            } else {
                queue.add(c);
            }
        }
        for(Character c : queue) {
            System.out.print(c);
        }
        System.out.println();
    }
    public static void main(String[] args) throws Exception {
        ONP problem = new ONP();
        BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
            int cases = Integer.valueOf(bin.readLine());
        for(int i =0; i< cases; i++) {
            String input = bin.readLine();
            problem.meth(input);
            //System.out.println(output);
        }
    }
}
