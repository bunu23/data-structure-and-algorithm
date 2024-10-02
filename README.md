# Data Structures and Algorithms

## Table of Contents

1. [Why Data Structures?](#why-data-structures)
2. [Types of Data Structures](#types-of-data-structures)
   - [Linear Data Structures](#linear-data-structures)
   - [Non-Linear Data Structures](#non-linear-data-structures)
3. [Array](#array)
4. [Linked List](#linked-list)
   - [Singly Linked List](#singly-linked-list)
   - [Doubly Linked List](#doubly-linked-list)

---

## Why Data Structures?

Data Structures are a way of organizing and storing data so that it can be accessed and modified efficiently. They are crucial for designing efficient algorithms and solving complex problems.

1. Efficiency: They help optimize performance for different operations (e.g., searching, sorting, inserting).
2. Organization: They provide ways to structure data in a meaningful way.
3. Abstraction: They allow developers to work with data in a more abstract way, focusing on what operations can be performed rather than how they are implemented.

---

## Types of Data Structures

### Linear Data Structures

In linear data structures, elements are arranged sequentially, and each element is connected to its previous and next element. They allow traversal in a single level of hierarchy.

**Examples**: Arrays, Linked List, Stacks, Queues

### Non-Linear Data Structures

In non-linear data structures, elements are not arranged sequentially. They are organized in a hierarchical manner or in a graph structure, allowing more complex relationships between elements.

**Examples**: Trees, Graphs

---

# [Array](Arrays)

An array is a linear data structure where elements are stored in contiguous memory locations. Each element is accessed using an index.

```
| Index | 0   | 1   | 2   | 3   | 4   |
|-------|-----|-----|-----|-----|-----|
| Value | 10  | 20  | 30  | 40  | 50  |

```

**Description:**

- <u>**Structure**:</u> Linear, fixed-size, elements stored in contiguous memory.
- <u>**Access**:</u> Directly by index.
- <u>**Traversal**:</u> Sequential from start to end.
- <u>**Use Cases**:</u> Suitable for simple, ordered collections where direct access is needed.

# [Linked List](LinkedList)

### [Singly Linked List](LinkedList/singly-linked-list)

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

---

## [Doubly Linked List](LinkedList/doubly-linked-list)

### Introduction

A **Doubly Linked List** is a type of linked list where each node contains three components:

1. **Data**: The value or information the node holds.
2. **Next Pointer**: A reference (pointer) to the next node in the list.
3. **Previous Pointer**: A reference (pointer) to the previous node in the list.

This structure allows us to traverse the list in **both forward and backward directions**.

### Key Differences from Singly Linked List:

- **Singly Linked List** has only a **next pointer**, making traversal possible only in the forward direction.
- **Doubly Linked List** has both **next** and **previous pointers**, making traversal possible in both **forward** and **backward** directions.

### Advantages of Doubly Linked List:

- **Bidirectional Traversal**: You can move forward and backward through the list.
- **Node Deletion**: A node can be deleted without needing access to its previous node.

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

### Diagram:

```

[null <- Node 1 <-> Node 2 <-> Node 3 <-> Node 4 -> null]

```

In this diagram:

- **Node 1** is the head, with its previous pointer set to `null`.
- **Node 4** is the tail, with its next pointer set to `null`.
- All other nodes (e.g., Node 2 and Node 3) have both a next and previous pointer.

---
