package org.example.Stack;

import java.util.EmptyStackException;

public class Stack {
    private ListNode top;
    private int length;

    public Stack() {
        top = null;
        length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int length() {
        return length;
    }

    public void push(int data) {
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
    }

    public int pop() {
        int ans = top.data;
        top = top.next;
        length--;
        return ans;
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }
}
