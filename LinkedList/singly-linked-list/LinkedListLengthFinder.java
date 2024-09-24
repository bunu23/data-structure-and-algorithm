// finding length of singly linked list
public class LinkedListLengthFinder {

    private ListNode head;

    private static class ListNode {

        private ListNode next;
        private int data;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public int findLength() {
        if (head == null) {
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        LinkedListLengthFinder linkedListLengthFinder = new LinkedListLengthFinder();
        linkedListLengthFinder.head = new ListNode(1);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(12);

        linkedListLengthFinder.head.next = second;
        second.next = third;
        third.next = fourth;

        linkedListLengthFinder.findLength();
        System.out.println("Length is " + linkedListLengthFinder.findLength());

    }
}
