package org.example.Queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(15);
        queue.enqueue(20);
        System.out.println(queue.length());
        System.out.println(queue.isEmpty());
    }
}
