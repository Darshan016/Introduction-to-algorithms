package org.example.DoublyLinkedList;

import java.util.List;

public class DoublyLinkedList {
    private ListNode head;
    private ListNode tail;
    private int length;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int length() {
        return length;
    }

    //traverse linked list in forward direction
    public void printForward() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // traverse linked list in backward direction
    public void printBackward() {
        ListNode temp = tail;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.previous;
        }
        System.out.println("null");
    }

    //add at the beginning of the list
    public void addFirst(int value) {
        ListNode listNode = new ListNode(value);
        if (isEmpty()) {
            tail = listNode;
        } else {
            head.previous = listNode;
        }
        listNode.next = head;
        head = listNode;
        length++;

    }

    //add at the end of the list
    public void addLast(int value) {
        ListNode listNode = new ListNode(value);
        if (isEmpty()) {
            head = listNode;
        } else {
            tail.next = listNode;
            listNode.previous = tail;
        }
        tail = listNode;
        length++;
    }
}
