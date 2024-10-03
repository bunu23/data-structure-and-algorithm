// Implementing circular doubly linked list, traversing and printing elements
public class CircularDoublyLinkedList {

    private ListNode last;
    private int length;

    private class ListNode {
        private ListNode next;
        private ListNode prev;
        private int data;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public CircularDoublyLinkedList() {
        last = null;
        length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void createCircularDLL() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(5);
        ListNode fourth = new ListNode(6);

        // Linking nodes in both directions
        first.next = second;
        second.prev = first;

        second.next = third;
        third.prev = second;

        third.next = fourth;
        fourth.prev = third;

        fourth.next = first; // Making it circular
        first.prev = fourth; // Making it circular

        last = fourth;
    }

    public void display() {
        if (last == null) {
            return;
        }

        ListNode first = last.next;
        ListNode current = first;
        do {
            System.out.print(current.data + " <--> ");
            current = current.next;
        } while (current != first);
        System.out.println(first.data); // Print the last element to complete the circular traversal
    }

    public static void main(String[] args) {
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.createCircularDLL();
        cdll.display();
    }
}