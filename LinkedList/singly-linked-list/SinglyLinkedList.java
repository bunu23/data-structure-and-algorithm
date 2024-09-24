// Demo example of singly linked list
public class SinglyLinkedList {
    public static void main(String[] args) {

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.head = new ListNode(20);
        ListNode second = new ListNode(21);
        ListNode third = new ListNode(9);
        ListNode fourth = new ListNode(18);
        // form a chain
        singlyLinkedList.head.next = second;
        second.next = third;
        third.next = fourth;

        singlyLinkedList.display();
    }

    private ListNode head;

    private static class ListNode {
        private int data; // can be any generic type
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("Null");
    }

}
