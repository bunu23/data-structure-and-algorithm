// code to reverse linked list
public class Reverse {

    private ListNode head;

    public class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }

        public String toString() {
            return Integer.toString(data);
        }

    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");

    }

    public void insert(int value) {
        ListNode newNode = new ListNode(value);
        while (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (null != current.next) {
            current = current.next;
        }
        current.next = newNode;
    }

    public ListNode reverse() {
        if (head == null) {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public static void main(String[] args) {
        Reverse rev = new Reverse();
        rev.insert(3);
        rev.insert(1);
        rev.insert(9);
        System.out.println("Original list:");
        rev.display();

        rev.head = rev.reverse();

        System.out.println("Reversed list:");
        rev.display();

    }

}
