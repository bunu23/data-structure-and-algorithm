// Implementing circular doubly linked list with insert and delete operations
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class InsertAndDelete {
    private Node head;

    public InsertAndDelete() {
        head = null;
    }

    // Insert at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node tail = head.prev;
            newNode.next = head;
            newNode.prev = tail;
            tail.next = newNode;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Insert at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node tail = head.prev;
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
        }
    }

    // Delete at the beginning
    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.next == head) {
            head = null;
        } else {
            Node tail = head.prev;
            tail.next = head.next;
            head.next.prev = tail;
            head = head.next;
        }
    }

    // Delete at the end
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.next == head) {
            head = null;
        } else {
            Node tail = head.prev;
            tail.prev.next = head;
            head.prev = tail.prev;
        }
    }

    // Print the list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        InsertAndDelete list = new InsertAndDelete();

        list.insertAtBeginning(1);
        list.insertAtBeginning(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);

        System.out.println("Circular Doubly Linked List:");
        list.printList();

        list.deleteAtBeginning();
        System.out.println("After deleting at the beginning:");
        list.printList();

        list.deleteAtEnd();
        System.out.println("After deleting at the end:");
        list.printList();
    }
}
