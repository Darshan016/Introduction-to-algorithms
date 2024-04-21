package org.example.PriorityQueue;

public class MaxPriorityQueue {
    Integer[] heap;
    int n;

    public MaxPriorityQueue(int capacity) {
        heap = new Integer[capacity + 1];
        n = 0;
    }

    public int getSize() {
        return n;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public void resize(int capacity) {
        Integer[] temp = new Integer[capacity];
        for (int i = 0; i < heap.length; i++) {
            temp[i] = heap[i];
        }
        heap = temp;
    }

    public void insert(int value) {
        if (n == heap.length - 1) {
            resize(2 * heap.length);
        }
        n++;
        heap[n] = value;
        swim(n);
    }

    private void swim(int n) {
        while (n > 1 && heap[n / 2] < heap[n]) {
            int temp = heap[n];
            heap[n] = heap[n / 2];
            heap[n / 2] = temp;
            n = n / 2;
        }
    }

    public void print() {
        for (int i = 1; i <= n; i++) {
            System.out.print(heap[i] + " ");
        }
    }

}
