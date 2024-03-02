package org.example.LinkedList;

public class LinkedList {
    private ListNode head;

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(50);
        ListNode fourth = new ListNode(44);
        linkedList.head.next = second;
        second.next=third;
        third.next=fourth;
        System.out.println(linkedList.head.data);
    }
}
