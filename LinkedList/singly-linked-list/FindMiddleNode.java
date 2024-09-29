
// finding middle node in linked list
public class FindMiddleNode {

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
            System.out.print(current.data + "  -> ");
            current = current.next;
        }
        System.out.println("null");
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

    public ListNode getMiddleNode() {
        if (head == null) {
            return null;
        }
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return slowPointer;
    }

    public static void main(String[] args) {
        FindMiddleNode findMiddleNode = new FindMiddleNode();
        findMiddleNode.insert(1);
        findMiddleNode.insert(21);
        findMiddleNode.insert(12);
        findMiddleNode.insert(98);
        System.out.println("original node");
        findMiddleNode.display();
        ListNode middleNode = findMiddleNode.getMiddleNode();
        System.out.println("middle node is - " + middleNode);
    }

}
