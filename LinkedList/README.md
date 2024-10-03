# Linked List

## Singly Linked List

### What is a Singly Linked List?

A singly linked list is a data structure used for storing a sequence of nodes, where each node contains:

1. **Data** (the actual value stored).
2. **Reference to the next node** in the list.

### How Does a Singly Linked List Work?

- Each node points to the next node in the sequence.
- The first node is referred to as the **head** and is responsible for holding the entire list.
- The last node points to `null`, indicating the end of the list.

### Properties of Singly Linked List:

1. Sequential Nodes: The nodes form a chain as each node points to the next.
2. Head Node: The head node holds the entire list.
3. Last Node: The last node points to null.

### Example of a singly linked list with 5 nodes:

```
Head -> [Data: 10] -> [Data: 8] -> [Data: 1] -> [Data: 11] -> [Data: 15] -> null
```

[Demo Code](singly-linked-list)

---

## Doubly Linked List

### Introduction

A **Doubly Linked List** is a two way linked list where each node contains three components:

1. **Data**: The value or information the node holds.
2. **Next Pointer**: A reference (pointer) to the next node in the list.
3. **Previous Pointer**: A reference (pointer) to the previous node in the list.
   This structure allows us to traverse the list in **both forward and backward directions**.

```
<-- | Previous Node | Current Node | Next Node | -->
```

### Key Differences from Singly Linked List:

- **Singly Linked List** has only a **next pointer**, making traversal possible only in the forward direction.
- **Doubly Linked List** has both **next** and **previous pointers**, making traversal possible in both **forward** and **backward** directions.
- A node in **Singly Linked List** can only be deleted if we have a pointer to previous node, but in **Doubly Linked List** we can deelte even we dont have a pointer to it's previous node. since singly linked list move in forward direction so in order to break any chain or any node in between singly linked list we usually need a pointer to its previous node to delete the node after it but in doubly linked list as we have 2 pointer to traverse in forward and backward, therefore we don’t need any pointer to its previous node.

### Node Representation:

In a doubly linked list, each node can be represented in Java as:

```java
class Node {
    int data;
    Node next;
    Node previous;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }
}
```

### Advantages of Doubly Linked List:

- **Bidirectional Traversal**: You can move forward and backward through the list.
- **Node Deletion**: A node can be deleted without needing access to its previous node.

### Node Diagram (with sample data):

```
null <- [10] <-> [20] <-> [30] <-> [40] -> null
```

### Explanation:

- **10** is the head, with its previous pointer set to `null`.
- **40** is the tail, with its next pointer set to `null`.
- All other nodes (e.g., Node 2 and Node 3) have both a next and previous pointer.

- **Node 1** contains data `10`, and its previous pointer is `null` (it's the head), while its next pointer leads to Node 2 (data `20`).
- **Node 2** contains data `20`, and its previous pointer points to Node 1 (data `10`), while its next pointer leads to Node 3 (data `30`).
- **Node 3** contains data `30`, and its previous pointer points to Node 2 (data `20`), while its next pointer leads to Node 4 (data `40`).
- **Node 4** contains data `40`, and its previous pointer points to Node 3 (data `30`), while its next pointer is `null`.

[Demo Code](doubly-linked-list)

---

## Circular Linked List

A **Circular Linked List** is a variation of a linked list where the last node points back to the first node instead of pointing to `null`. This forms a circular structure, allowing continuous traversal of the list.

### Key Characteristics

1. **Structure**:

   - Each node in a circular linked list contains data and a reference (or pointer) to the next node.
   - In the case of a circular singly linked list, the last node's next pointer points back to the head node, creating a loop.

2. **Types**:

   - **Circular Singly Linked List**: Each node points to the next node, and the last node points to the first node.
   - **Circular Doubly Linked List**: Each node has two pointers (next and previous), allowing traversal in both directions. The last node's next pointer points to the head, and the head's previous pointer points to the last node.

3. **Head and Tail**:

   - In circular linked lists, you typically keep track of the **head** (the first node) and possibly the **tail** (the last node) for efficient insertion and deletion operations.

4. **Traversal**:
   - Unlike regular linked lists, where you reach the end of the list (null), in a circular linked list, you can continue traversing indefinitely from any node until you return to the starting point.

### Advantages

- **Efficient Insertions and Deletions**: Operations at both ends can be performed in constant time if you maintain pointers to both the head and tail.
- **No Null References**: There’s no need to check for null pointers while traversing, making certain algorithms simpler.

### Use Cases

- **Round-Robin Scheduling**: Often used in operating systems for process scheduling.
- **Circular Buffers**: Useful in situations where data is continuously produced and consumed, like in streaming applications.
- **Game Development**: In games, to manage players or resources that need to be cycled through repeatedly.

### Example

In a circular singly linked list, if you have the following nodes:

- Node 1 → Node 2 → Node 3 → Node 4

The last node (Node 4) will point back to Node 1, like this:

```plaintext
      +-------+
      |       |
+-----> [1] -> [2] -> [3] -> [4] --+
|     +-------+                    |
|__________________________________|
```

## Node Representation

### 1. **Node Class for Circular Singly Linked List**

```java
// Implementing circular singly linked list
public class CircularSinglyLinkedList {

    private ListNode last; // Reference to the last node
    private int length; // Holds the size of the circular singly linked list

    private class ListNode {
        private ListNode next; // Pointer to the next node
        private int data; // Data stored in the node

        public ListNode(int data) {
            this.data = data; // Constructor to initialize the node with data
        }
    }

    // Constructor to initialize the circular singly linked list
    public CircularSinglyLinkedList() {
        last = null; // Initially, the list is empty
        length = 0; // Length is set to 0
    }

    // Returns the length of the list
    public int length() {
        return length;
    }

    // Checks if the list is empty
    public boolean isEmpty() {
        return length == 0; // Returns true if length is 0
    }

    // Creates a circular singly linked list with initial nodes
    public void createCircularLL() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(5);
        ListNode fourth = new ListNode(6);

        // Linking nodes together
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first; // Last node points back to the first node

        last = fourth; // Set the last node to the fourth node

    }

    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList(); // Create a new Circular Singly Linked List
        csll.createCircularLL(); // Create the circular linked list

    }
}
```

### 2. **Node Class for Circular Doubly Linked List**

```java

class CircularDoublyLinkedListNode {
    int data;
    CircularDoublyLinkedListNode next; // Pointer to the next node
    CircularDoublyLinkedListNode prev; // Pointer to the previous node

    // Constructor
    public CircularDoublyLinkedListNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
```

### Example Usage

To create and link nodes in a Circular Doubly Linked List:

```java

CircularDoublyLinkedListNode firstNode = new CircularDoublyLinkedListNode(1);
CircularDoublyLinkedListNode secondNode = new CircularDoublyLinkedListNode(2);
CircularDoublyLinkedListNode thirdNode = new CircularDoublyLinkedListNode(3);


firstNode.next = secondNode;
secondNode.next = thirdNode;
thirdNode.next = firstNode; // Circular link

firstNode.prev = thirdNode; // Linking back for circular doubly
secondNode.prev = firstNode;
thirdNode.prev = secondNode;
```

### Explanation

- **CircularSinglyLinkedListNode**:
  - Contains an integer `data` field for storing the value.
  - Contains a `next` field pointing to the next node in the list.
- **CircularDoublyLinkedListNode**:
  - Similar to the singly linked list node but includes a `prev` field that points to the previous node, allowing bidirectional traversal.

[Demo code](circular-linked-list)

---
