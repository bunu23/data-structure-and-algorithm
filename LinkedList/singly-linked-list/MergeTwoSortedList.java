public class MergeTwoSortedList {

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

    public static ListNode merge(ListNode a, ListNode b) {

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        if (a == null) {
            tail.next = b;
        } else {
            tail.next = a;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        MergeTwoSortedList ml = new MergeTwoSortedList();
        ml.insert(1);
        ml.insert(4);
        ml.insert(8);

        MergeTwoSortedList ml2 = new MergeTwoSortedList();
        ml2.insert(3);
        ml2.insert(5);
        ml2.insert(8);
        ml2.insert(9);
        ml2.insert(10);
        ml2.insert(18);

        ml.display();
        System.out.println();
        ml2.display();
        System.out.println();
        MergeTwoSortedList result = new MergeTwoSortedList();
        result.head = merge(ml.head, ml2.head);
        result.display();
    }
}
