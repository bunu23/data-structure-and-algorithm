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

## Doubly Linked List

### Introduction

A **Doubly Linked List** is a two way linked list where each node contains three components:

1. **Data**: The value or information the node holds.
2. **Next Pointer**: A reference (pointer) to the next node in the list.
3. **Previous Pointer**: A reference (pointer) to the previous node in the list.
   This structure allows us to traverse the list in **both forward and backward directions**.

---

<-- | Previous Node | Current Node | Next Node | -->
--------------------ListNode--------------------------

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
