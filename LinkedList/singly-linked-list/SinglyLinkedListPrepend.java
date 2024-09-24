// insert node at the beginning of Singly linked list
public class SinglyLinkedListPrepend {

    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display() {
        SinglyLinkedListPrepend.ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {
        SinglyLinkedListPrepend singlyLinkedListPrepend = new SinglyLinkedListPrepend();
        singlyLinkedListPrepend.insertFirst(22);
        singlyLinkedListPrepend.insertFirst(33);
        singlyLinkedListPrepend.display();
    }

}
