package org.example.Queue;

public class Queue {
    protected ListNode front;
    protected ListNode rear;
    protected int length;

    public Queue() {
        this.front = null;
        this.rear = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int length() {
        return length;
    }

    public void enqueue(int data) {
        ListNode listNode = new ListNode(data);
        if (isEmpty()) {
            front = listNode;
        } else {
            rear.next = listNode;
        }
        rear = listNode;
        length++;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        }
        ListNode current = front;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is already empty.");
        }
        int result = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        length--;
        return result;
    }
}
