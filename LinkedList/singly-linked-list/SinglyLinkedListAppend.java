
// insert node at the end of linked list
public class SinglyLinkedListAppend {
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
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "  -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (null != current.next) {
            current = current.next;
        }
        current.next = newNode;
    }

    public static void main(String[] args) {
        SinglyLinkedListAppend sll = new SinglyLinkedListAppend();
        sll.insertLast(3);
        sll.insertLast(31);
        sll.insertLast(41);

        sll.display();
    }

}
