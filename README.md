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
   - [Circular Linked List](#circular-linked-list)
     - [Circular Singly Linked List](#circular-singly-linked-list)
     - [Circular Doubly Linked List](#circular-doubly-linked-list)
5. [Stack](#stack)

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

[Back to TOC](#table-of-contents)

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

[Back to TOC](#table-of-contents)

---

# [Linked List](LinkedList)

A linked list is a data structure consisting of a sequence of nodes. Each node contains data and one or more pointers to the next (and possibly previous) nodes in the sequence.

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

[Back to TOC](#table-of-contents)

---

### [Doubly Linked List](LinkedList/doubly-linked-list)

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

[Back to TOC](#table-of-contents)

---

### [Circular Linked List](LinkedList/circular-linked-list)

A Circular Linked List is a variation of a linked list where the last node points back to the first node instead of pointing to null. This forms a circular structure, allowing continuous traversal of the list.

#### [Circular Singly Linked List](LinkedList/circular-linked-list/circular-singly-linked-list)

##### What is Circular Singly Linked List ?

In a **Circular Singly Linked List**, each node points to the next node, similar to a singly linked list. However, instead of the last node pointing to `null`, it points back to the **head node**, forming a chain.

##### Key Differences from Singly Linked List

- The **last node's next pointer** points to the first node, not `null`.
- A **last pointer** is maintained, making operations like insertion or deletion at the end of the list more efficient.

##### Diagram Representation

```plaintext
Head -> [1] -> [8] -> [10] -> [16] -> (points back to Head)
```

Here, the **last node (16)** points to the **head node (1)**, forming a circular structure.

##### Benefits:

- **Efficient Insertion/Deletion**: By keeping track of the last node, we can insert or delete a node at the end of the list in constant time.
- **Traversal**: Reaching the first node from the last node is straightforward as `last.next` points to `head`.

[Back to TOC](#table-of-contents)

#### [Circular Doubly Linked List](LinkedList/circular-linked-list/circular-doubly-linked-list)

##### What is Circular Doubly Linked List ?

A **Circular Doubly Linked List** is an extension of a doubly linked list where each node has a **next** and a **previous pointer**. In this circular version, the **last node's next pointer** points to the head, and the **first node's previous pointer** points to the last node.

##### Diagram Representation

```plaintext
[Head] <-> [8] <-> [10] <-> [16] <-> (points back to Head)
```

##### Key Differences:

- Nodes maintain pointers in **both directions**.
- The **first node’s previous pointer** points to the **last node**, and the **last node's next pointer** points to the **first node**.

##### Benefits:

- **Efficient traversal** in both directions.
- Like the Circular Singly Linked List, it allows constant time insertion and deletion.

[Back to TOC](#table-of-contents)

---

# [Stack](stack)

A **stack** is a linear data structure that follows a specific order for operations.
It is based on the Last In, First Out (LIFO) principle, meaning that the last element added to the stack is the first one to be removed. It is an ordered list in which insertion and deletion are done in one end i.e top.

### Key Features

1. **LIFO Structure**:

   - The last element pushed onto the stack is the first one to be popped off.
   - Visualizing it as a stack of plates, you can only add or remove the top plate.

2. **Dynamic Size**:

   - Stacks can grow and shrink as needed, making them flexible in terms of memory usage.

3. **Access**:
   - Elements can only be accessed from the top of the stack.

### Basic Operations

1. **Push**:

   - Adds an element to the top of the stack.
   - Example:
     ```java
     stack.push(10);
     stack.push(20);
     ```

2. **Pop**:

   - Removes the top element from the stack and returns it.
   - Example:
     ```java
     int topElement = stack.pop(); // returns 20
     ```

3. **Peek (or Top)**:

   - Returns the top element without removing it.
   - Example:
     ```java
     int topElement = stack.peek(); // returns 10
     ```

### Implementation

1. **Array-Based Stack**:

   - A fixed-size array is used to store the elements.
   - May lead to stack overflow if the limit is exceeded.

2. **Linked List-Based Stack**:
   - A linked list is used, where each node points to the next node.
   - More flexible, as it grows and shrinks dynamically.

### Diagram

```plaintext
      +---+
      | 3 |  <-- Top (Last In)
      +---+
      | 2 |
      +---+
      | 1 |
      +---+
      |  1 |  <-- Bottom (First In)
      +---+
```

- **Top**: The top of the stack (in this case, the number `3`) is the last element added and will be the first one to be removed when a pop operation is performed.
- **Elements**: The stack contains elements (`1`,`1`, `2`, `3`) in the order they were added, with `1` being the first element added and at the bottom of the stack.

[Back to TOC](#table-of-contents)

---

[Back to TOC](#table-of-contents)

---
