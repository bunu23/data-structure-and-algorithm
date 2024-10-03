
import java.util.NoSuchElementException;

// delete last node
public class DeleteLast {

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

    public DeleteLast() {
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

    public ListNode deleteLastNode() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        ListNode temp = tail;
        if (head == tail) {
            tail = null;
        } else {
            tail.previous.next = null;

        }
        tail = tail.next;
        temp.previous = null;
        length--;
        return temp;
    }

    public static void main(String[] args) {
        DeleteLast dll = new DeleteLast();
        dll.insert(3);
        dll.insert(3);
        dll.insert(33);
        dll.insert(13);
        dll.displayForward();
        dll.deleteLastNode();
        dll.displayForward();
    }

}
