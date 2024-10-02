
// Insert a new node at the beginning of the list.
public class DoublyLinkedListPrepend {

    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode {
        private int data;
        private ListNode next;
        private ListNode previous;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public DoublyLinkedListPrepend() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int length() {
        return length;
    }

    public void displayForward() {
        if (head == null) {
            return;
        }
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void displayBack() {
        if (tail == null) {
            return;
        }

        ListNode temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.previous;
        }
        System.out.println("null");
    }

    public void insert(int value) {
        ListNode node = new ListNode(value);
        if (isEmpty()) {
            tail = node;

        } else {
            head.previous = node;
        }

        node.next = head;
        head = node;
        length++;
    }

    public static void main(String[] args) {
        DoublyLinkedListPrepend dll = new DoublyLinkedListPrepend();
        dll.insert(3);
        System.out.println("Display forward");
        dll.displayForward();
        System.out.println("Display backward");
        dll.displayBack();
        dll.insert(3);
        dll.insert(33);
        dll.insert(13);
        System.out.println("Display forward");
        dll.displayForward();
        System.out.println("Display backward");
        dll.displayBack();
    }

}
