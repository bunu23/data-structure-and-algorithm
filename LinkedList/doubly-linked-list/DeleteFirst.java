
import java.util.NoSuchElementException;

// delete first node
public class DeleteFirst {

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

    public DeleteFirst() {
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

    public ListNode deleteFirstNode() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        ListNode temp = head;
        if (head == tail) {
            tail = null;
        } else {
            head.next.previous = null;

        }
        head = head.next;
        temp.next = null;
        length--;
        return temp;
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

    public static void main(String[] args) {
        DeleteFirst dll = new DeleteFirst();
        dll.insert(3);
        dll.insert(3);
        dll.insert(33);
        dll.insert(13);
        dll.displayForward();
        dll.deleteFirstNode();
        dll.displayForward();
        dll.deleteFirstNode();
        dll.displayForward();

    }

}
