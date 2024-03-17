package org.example.MiscProblems;

import java.util.Stack;

public class ValidParenthesis {
    static boolean validParenthesis(String s) {
        Stack<Character> stack = new Stack<>();
//        char[] arr = s.toCharArray();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char top = stack.peek();
                    if ((ch == ')' && top == '(') || ch == ']' && top == '[' || ch == '}' && top == '{') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "{{)}";
        System.out.println(validParenthesis(s));
    }
}
