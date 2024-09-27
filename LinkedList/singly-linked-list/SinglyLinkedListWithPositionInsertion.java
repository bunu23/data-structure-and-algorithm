
// Insert a node at specific position
public class SinglyLinkedListWithPositionInsertion {

    private ListNode head;

    class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void insert(int position, int value) {
        if (position <= 0) {
            throw new IllegalArgumentException("Invalid position! Position should be greater than 0.");
        }

        ListNode newNode = new ListNode(value);

        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = newNode;
            newNode.next = current;

        }
    }

    public static void main(String[] args) {
        SinglyLinkedListWithPositionInsertion sll = new SinglyLinkedListWithPositionInsertion();
        sll.insert(1, 3);
        sll.insert(1, 4);
        sll.insert(2, 5);
        sll.insert(2, 8);
        sll.display();
    }

}
