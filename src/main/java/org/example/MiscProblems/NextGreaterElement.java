package org.example.MiscProblems;

import java.util.Stack;

public class NextGreaterElement {
    static int[] nextGreaterElement(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (!stack.isEmpty()) {
                while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                    stack.pop();
                }
            }
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }
            stack.push(arr[i]);

        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 23, 56, 6};
        int[] ans = nextGreaterElement(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");

        }
    }
}
