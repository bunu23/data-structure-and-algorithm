
// finding nth node from end of singly linked list
public class FindNthNode {
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

    public ListNode getNthNode(int n) {
        if (head == null) {
            return null;
        }
        if (n < 0) {
            throw new IllegalArgumentException("invalid :" + n);
        }

        ListNode reference = head;
        ListNode main = head;

        int count = 0;

        while (count < n) {
            if (reference == null) {
                throw new IllegalArgumentException(n + ": it is greater than number of node");

            }
            reference = reference.next;
            count++;
        }
        while (reference != null) {
            reference = reference.next;
            main = main.next;
        }
        return main;
    }

    public static void main(String[] args) {
        FindNthNode findNthNode = new FindNthNode();

        findNthNode.insert(2);
        findNthNode.insert(22);
        findNthNode.insert(13);
        findNthNode.insert(45);

        System.out.println("The list is:");
        findNthNode.display(); // Output: 2 --> 22 --> 13 --> 45 --> null

        System.out.println("\n2nd node from the end is: " + findNthNode.getNthNode(2));

    }

}
