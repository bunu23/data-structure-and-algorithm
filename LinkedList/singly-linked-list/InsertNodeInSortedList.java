// Insert node in sorted singly linked list
public class InsertNodeInSortedList {
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
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");

    }

    public void insert(int value) {
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

    public ListNode insertNode(int value) {

        ListNode newNode = new ListNode(value);
        if (head == null) {
            return newNode;
        }

        ListNode current = head;
        ListNode temp = null;
        while (current != null && current.data < newNode.data) {
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
        return head;
    }

    public static void main(String[] args) {

        InsertNodeInSortedList sl = new InsertNodeInSortedList();
        sl.insert(2);
        sl.insert(3);
        sl.insert(4);
        sl.insert(6);
        System.out.println("Original linked list");
        sl.display();
        System.out.println("\n After Insertion");
        sl.insertNode(6);
        sl.display();
    }
}
