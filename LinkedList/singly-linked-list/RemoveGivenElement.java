//Remove a key from singly linked list
public class RemoveGivenElement {

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

    public void removeGivenKey(int key) {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        if (head.data == key) {
            head = head.next;
            return;
        }
        ListNode current = head;
        ListNode temp = null;
        while (current != null && current.data != key) {
            temp = current;
            current = current.next;
        }
        if (current == null) {
            System.out.println("Key " + key + " not found in the list.");
            return;
        }
        temp.next = current.next;
    }

    public static void main(String[] args) {
        RemoveGivenElement removeGivenElement = new RemoveGivenElement();
        removeGivenElement.insert(1);
        removeGivenElement.insert(2);
        removeGivenElement.insert(3);
        removeGivenElement.insert(4);
        System.out.println("Original List");
        removeGivenElement.display();
        System.out.println("\nUpdated List after removing");
        removeGivenElement.removeGivenKey(20);
        removeGivenElement.display();
    }
}
