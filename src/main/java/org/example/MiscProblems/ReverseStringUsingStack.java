package org.example.MiscProblems;

import java.util.Stack;

// reverse a string using stack data structure
public class ReverseStringUsingStack {

    public static String reverse(String s){
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        for (char ch:arr){
            stack.push(ch);
        }
        for (int i=0;i<s.length();i++){
            arr[i]=stack.pop();
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String s = "ABCD";
        System.out.println(reverse(s));
    }
}
