// Demo code to search element
public class SearchElement {

    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void insert(int value) {
        ListNode node = new ListNode(value);
        if (head == null) {
            head = node;
            return;
        }
        ListNode current = head;
        while (null != current.next) {
            current = current.next;
        }
        current.next = node;
    }

    public boolean searchElement(int sKey) {
        if (head == null) {
            return false;

        }
        ListNode current = head;
        while (current != null) {
            if (current.data == sKey) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        SearchElement se = new SearchElement();
        se.insert(3);
        se.insert(1);
        se.insert(98);
        se.display();
        System.out.println(se.searchElement(1));

    }

}
