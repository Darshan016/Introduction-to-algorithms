package org.example.LinkedList;


import java.util.List;

public class LinkedList {
    private ListNode head;

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
//        linkedList.head = new ListNode(10);
//        ListNode second = new ListNode(20);
//        ListNode third = new ListNode(10);
//        ListNode fourth = new ListNode(44);
//        linkedList.head.next = second;
//        second.next = third;
//        third.next = fourth;
//        linkedList.addFirst(55);
//        linkedList.addFirst(10);
//        linkedList.addLast(44);
//        linkedList.addFirst(8);
//        linkedList.addFirst(3);
//        linkedList.addFirst(2);
//        linkedList.addFirst(1);
//        linkedList.addLast(7);
//        linkedList.createALoopInLinkedList();
//        linkedList.print();
//        linkedList.insertInSorted(6);
//        linkedList.removeDuplicates();
//        linkedList.deleteByValue(3);
//        linkedList.print();
//        System.out.println(linkedList.findLength());
//        linkedList.insertAt(4, 4);
//        linkedList.deleteFirst();
//        linkedList.deleteLast();
//        linkedList.deleteAt(8);
//        linkedList.reverse();
//        System.out.println(linkedList.findMiddleElement());
//        linkedList.print();
//        System.out.println(linkedList.findNthElementFromEnd(7));
//        System.out.println(linkedList.searchNode(70));
//        ListNode ans=linkedList.getStartingNodeOfLoop();
//        System.out.println(ans.data);
//        System.out.println(linkedList.detectLoop());
//        linkedList.removeLoop();
//        System.out.println(linkedList.detectLoop());
//        linkedList.print();
//        LinkedList l1 = new LinkedList();
//        LinkedList l2 = new LinkedList();
//        l1.addFirst(9);
//        l1.addFirst(6);
//        l1.addFirst(4);
//        l1.addFirst(2);
//        System.out.println(l1.findMiddleElement());
//        l2.addFirst(8);
//        l2.addFirst(5);
//        l2.addFirst(3);
//        l1.print();
//        l1.deleteMiddleElement();
//        l1.print();
//        l2.print();
//        LinkedList l3 = new LinkedList();
//        l3.head = mergeTwoSortedLists(l1.head,l2.head);
//        l3.head = addTwoNumbers(l1.head, l2.head);
//        l3.print();
        linkedList.createALoopInLinkedList();
        System.out.println(linkedList.findLengthOfLoop());

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

    public void addFirst(int value) {
        ListNode listNode = new ListNode(value);
        listNode.next = head;
        head = listNode;
    }

    public void addLast(int value) {
        ListNode listNode = new ListNode(value);
        if (head == null) {
            head = listNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = listNode;
    }

    public void insertAt(int value, int position) {
        ListNode listNode = new ListNode(value);
        if (position == 0) {
            listNode.next = head;
            head = listNode;
        } else {
            ListNode previous = head;
            int index = 0;
            while (index < position - 1) {
                previous = previous.next;
                index++;
            }
            ListNode current = previous.next;
            listNode.next = current;
            previous.next = listNode;
        }
    }

    public ListNode deleteFirst() {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public ListNode deleteLast() {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }

    public void deleteAt(int position) {
        if (position == 0) {
            head = head.next;
            return;
        }
        if (position >= this.findLength() || position < 0) {
            return;
        }
        ListNode previous = head;
        int index = 0;
        while (index < position - 1) {
            previous = previous.next;
            index++;
        }
        ListNode current = previous.next;
        previous.next = current.next;

    }

    public int searchNode(int value) {
        ListNode current = head;
        int index = 0;
        while (current != null) {
            if (current.data == value) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    //1->2->3->4
    public void reverse() {
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    public int findMiddleElement() {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public int findNthElementFromEnd(int n) {
        if (n > this.findLength()) {
            return -1;
        }
        ListNode main = head;
        ListNode reference = head;
        int count = 0;
        while (count < n) {
            reference = reference.next;
            count++;
        }
        while (reference != null) {
            reference = reference.next;
            main = main.next;
        }
        return main.data;
    }

    public void removeDuplicates() {
        if (head == null) {
            return;
        }
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public void insertInSorted(int value) {
        ListNode listNode = new ListNode(value);
        if (head == null) {
            head = listNode;
        }
        ListNode current = head;
        ListNode temp = null;
        while (current != null && current.data < value) {
            temp = current;
            current = current.next;
        }
        listNode.next = current;
        temp.next = listNode;

    }

    public void deleteByValue(int value) {
        if (head == null) {
            return;
        }
        ListNode current = head;
        ListNode temp = null;
        while (current != null && current.data != value) {
            temp = current;
            current = current.next;
        }
        if (current == null) {
            return;
        } else {
            temp.next = current.next;

        }
    }

    public void createALoopInLinkedList() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);
        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;

    }

    public boolean detectLoop() {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public ListNode getStartingNodeOfLoop() throws NullPointerException {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return getStartingNode(slow);
            }
        }
        throw new NullPointerException("null value");
//        return null;
    }

    public ListNode getStartingNode(ListNode slow) {
        ListNode temp = head;
        while (slow != temp) {
            temp = temp.next;
            slow = slow.next;
        }
        return temp;
    }

    public void removeLoop() {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                remove(slow);
                return;
            }
        }
    }

    public void remove(ListNode slow) {
        ListNode temp = head;
        while (slow.next != temp.next) {
            temp = temp.next;
            slow = slow.next;
        }
        slow.next = null;
    }

    public static ListNode mergeTwoSortedLists(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }
        if (head1 == null) {
            tail.next = head2;

        } else {
            tail.next = head1;
        }
        return dummy.next;
    }

    public static ListNode addTwoNumbers(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int carry = 0;
        while (a != null || b != null) {
            int x = (a != null) ? a.data : 0;
            int y = (b != null) ? b.data : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            tail.next = new ListNode(sum % 10);
            tail = tail.next;
            if (a != null) a = a.next;
            if (b != null) b = b.next;
        }
        if (carry > 0) {
            tail.next = new ListNode(carry);
        }
        return dummy.next;
    }

    public void deleteMiddleElement() {
        ListNode fast = head;
        ListNode slow = head;
        ListNode previous = slow;
        while (fast != null && fast.next != null) {
            previous = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        previous.next = slow.next;
    }

    public int findLengthOfLoop() {
        ListNode fast = head;
        ListNode slow = head;
        int count = 0;
        boolean loopExists = false;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                loopExists = true;
                break;
            }
        }
        if (loopExists) {
            do {
                slow = slow.next;
                count++;
            } while (slow != fast);
        }
        return count;

    }

}
