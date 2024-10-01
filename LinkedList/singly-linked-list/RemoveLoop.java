
// remove loop from linked list
public class RemoveLoop {
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

    public void removeLoop() {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                removeLoop(slow);
                return;
            }
        }

    }

    private void removeLoop(ListNode slow) {
        ListNode temp = head;
        while (temp.next != slow.next) {
            temp = temp.next;
            slow = slow.next;

        }
        slow.next = null;
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
        fifth.next = six;
        six.next = seven;
        seven.next = third;

    }

    public static void main(String[] args) {
        RemoveLoop rl = new RemoveLoop();
        rl.createLoop();
        System.out.println(rl.containsLoop());
        rl.removeLoop();
        rl.display();

    }
}
