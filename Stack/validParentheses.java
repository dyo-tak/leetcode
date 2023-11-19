import java.io.*;
import java.util.*;


class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        Integer n = s.length();

        for (int i = 0; i < n; i++) {
            char x = s.charAt(i);

            if (x == '(' || x == '{' || x == '[') {
                stack.push(x);
                continue;
            }

            if (stack.isEmpty()) {
                return false;

            }

            char check;

            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '{' || check == '(')
                        return false;
                    break;
            }
        }

        return stack.isEmpty();
    }
}

public class validParentheses {
    public static void main(String[] args) {
        Solution s = new Solution();
        String testString = "(123)([23+1]){}";
        System.out.println(s.isValid(testString));
    }
}