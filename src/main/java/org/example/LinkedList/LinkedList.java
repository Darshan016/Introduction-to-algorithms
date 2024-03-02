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
        second.next = third;
        third.next = fourth;
        linkedList.addFirst(55);
        linkedList.addFirst(100);
        linkedList.print();
//        System.out.println(linkedList.findLength());
    }

    public void print() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int findLength() {
        ListNode current = head;
        int length = 0;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    public void addFirst(int value){
        ListNode listNode = new ListNode(value);
        listNode.next=head;
        head=listNode;
    }

}
