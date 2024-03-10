package org.example.DoublyLinkedList;

public class DoublyLinkedListMain {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst(10);
        dll.addFirst(20);
        dll.addFirst(30);
        dll.printForward();
        System.out.println(dll.length());
    }
}
