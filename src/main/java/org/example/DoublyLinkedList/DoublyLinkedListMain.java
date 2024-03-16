package org.example.DoublyLinkedList;

public class DoublyLinkedListMain {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst(10);
        dll.addFirst(20);
        dll.addFirst(30);
//        dll.printForward();
//        System.out.println(dll.length());
        dll.addLast(10);
        dll.addLast(50);
        dll.printForward();
//        System.out.println(dll.length());
//        System.out.println(dll.isEmpty());
//        int demp = dll.deleteFirst().data;
//        System.out.println(demp);
//        dll.printForward();
        System.out.println(dll.length());
        System.out.println(dll.deleteLast().data);
        dll.printForward();
    }
}
