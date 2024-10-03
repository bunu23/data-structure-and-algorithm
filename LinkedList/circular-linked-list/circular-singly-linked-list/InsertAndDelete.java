
// Implementing circular Singly linked list with insert and delete operations

import java.util.NoSuchElementException;

public class InsertAndDelete {
    private ListNode last;
    private int length;

    private class ListNode {
        private ListNode next;
        private int data;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public InsertAndDelete() {
        last = null;
        length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void createCircularLinkedList() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(10);
        ListNode fourth = new ListNode(15);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        last = fourth;
    }

    public void display() {
        if (last == null) {
            return;
        }

        ListNode first = last.next;
        while (first != last) {
            System.out.print(first.data + " --> ");
            first = first.next;
        }
        System.out.println(first.data);
    }

    public void insertFirst(int data) {
        ListNode temp = new ListNode(data);
        if (last == null) {
            last = temp;
        } else {
            temp.next = last.next;
        }
        last.next = temp;
        length++;
    }

    public void insertLast(int data) {
        ListNode temp = new ListNode(data);
        if (last == null) {
            last = temp;
            last.next = last;
        } else {
            temp.next = last.next;
            last.next = temp;
            last = temp;
        }
        length++;
    }

    public ListNode removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("Circular Singly Linked List is already empty");
        }

        ListNode temp = last.next;
        if (last.next == last) {
            last = null;
        } else {
            last.next = temp.next;
        }
        temp.next = null;
        length--;
        return temp;
    }

    public ListNode removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("Circular Singly Linked List is already empty");
        }

        ListNode current = last.next;
        while (current.next != last) {
            current = current.next;
        }
        ListNode removedNode = last;
        if (current == last) {
            last = null;
        } else {
            current.next = last.next;
            last = current;
        }
        length--;
        return removedNode;
    }

    public static void main(String[] args) {
        InsertAndDelete cll = new InsertAndDelete();
        cll.createCircularLinkedList();
        System.out.println("Initial Circular Singly Linked List:");
        cll.display();

        System.out.println("\nInserting 0 at the beginning:");
        cll.insertFirst(0);
        cll.display();

        System.out.println("\nInserting 20 at the end:");
        cll.insertLast(20);
        cll.display();

        System.out.println("\nRemoving the first element:");
        cll.removeFirst();
        cll.display();

        System.out.println("\nRemoving the last element:");
        cll.removeLast();
        cll.display();
    }
}
