
//Insert a new node at the end of the doubly linked list.
public class DoublyLinkedListAppend {

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

    public DoublyLinkedListAppend() {
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
            head = node;
        } else {
            tail.next = node;
            node.previous = tail;
        }
        tail = node;
        length++;
    }

    public static void main(String[] args) {
        DoublyLinkedListAppend dll = new DoublyLinkedListAppend();
        dll.insert(3);
        dll.insert(3);
        dll.insert(33);
        dll.insert(13);
        System.out.println("Display forward");
        dll.displayForward();

    }

}
