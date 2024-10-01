
//detect a loop
public class DetectLoop {
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

    public boolean containsLoop() {
        ListNode pointerOne = head;
        ListNode pointerTwo = head;

        while (pointerOne != null && pointerOne.next != null) {
            pointerOne = pointerOne.next.next;
            pointerTwo = pointerTwo.next;
            if (pointerOne == pointerTwo) {
                return true;
            }
        }
        return false;
    }

    public void createLoop() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode six = new ListNode(6);
        ListNode seven = new ListNode(7);


        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next=six;
        six.next = seven;
        seven.next = third;

    }

    public static void main(String[] args) {
        DetectLoop dl = new DetectLoop();
        dl.createLoop();
        System.out.println(dl.containsLoop());
    }

}
