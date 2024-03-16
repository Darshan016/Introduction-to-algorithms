package org.example.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack.length());
        stack.push(10);
        stack.push(20);
        stack.push(30);
//        System.out.println(stack.length());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }


}
