
// delete node at given position
public class DeleteNodeGivenPosition {

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
        if (head == null) {
            System.out.println("empty list");
            return;
        }
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void insert(int value) {

        ListNode node = new ListNode(value);
        if (head == null) {
            head = node;
            return;
        }
        ListNode current = head;
        while (null != current.next) {
            current = current.next;
        }
        current.next = node;
    }

    public void delete(int position) {
        if (position <= 0) {
            throw new IllegalArgumentException("Invalid position! Position should be greater than 0.");
        }
        if (position == 1) {
            head = head.next;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;

        }
    }

    public static void main(String[] args) {
        DeleteNodeGivenPosition dll = new DeleteNodeGivenPosition();
        dll.insert(21);
        dll.insert(12);
        dll.insert(19);
        dll.display();
        dll.delete(2);
        dll.display();
    }

}
