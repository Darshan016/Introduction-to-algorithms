package org.example.CircularSinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
//        circularLinkedList.createCircularLinkedList();
//        System.out.println(circularLinkedList.isEmpty());
//        circularLinkedList.print();
        circularLinkedList.addFirst(12);
        circularLinkedList.addFirst(20);
        circularLinkedList.addFirst(55);
        System.out.println(circularLinkedList.isEmpty());
        System.out.println(circularLinkedList.length());
        circularLinkedList.addLast(44);
        circularLinkedList.print();
//        circularLinkedList.deleteFirst();
        System.out.println(circularLinkedList.deleteFirst().data);
        circularLinkedList.print();
    }
}
