package org.example.Queue;

public class Queue {
    private ListNode front;
    private ListNode rear;
    private int length;

    public boolean isEmpty() {
        return length == 0;
    }

    public int length() {
        return length;
    }

    public void enqueue(int data){
        ListNode listNode = new ListNode(data);
        if (isEmpty()){
            front = listNode;
        }else{
            rear.next = listNode;
        }
        rear = listNode;
        length++;
    }
}
