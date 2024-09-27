
// Delete first Node
public class DeleteFirstNode {

    private ListNode head;

    private static class ListNode {
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

    public ListNode deleteFirst() {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public static void main(String[] args) {
        DeleteFirstNode dl = new DeleteFirstNode();
        dl.insert(3);
        dl.insert(23);
        dl.display();
        System.out.println("Deleted node: " + dl.deleteFirst());
        System.out.println("Deleted node: " + dl.deleteFirst());

        dl.display();
    }
}
