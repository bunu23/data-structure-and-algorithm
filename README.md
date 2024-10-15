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
6. [Queue](#queue)
7. [Tree](#tree)
   - [Binary Tree](#binary-tree)
   - [Tree Traversal](#tree-traversal)
8. [Priority Queue](#priority-queue)

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

# [Queue](queue)

A **Queue** is a linear data structure that follows the **First In, First Out (FIFO)** principle. This means that the element inserted first is the one to be removed first, much like a line of people waiting for a service. It is an ordered list in which insertion are done at one end called rear and deletion on other end called front.

## Key Operations:

1. **Enqueue**: Add an element to the end of the queue.
2. **Dequeue**: Remove the element from the front of the queue.

## Queue Structure:

```
+------+------+------+------+
|  10  |  20  |  30  |  40  |
+------+------+------+------+
Front                     Rear
```

1. **Enqueue Operation**:

   - Inserts elements at the rear end.
   - After inserting 50:

   ```
   +------+------+------+------+------+
   |  10  |  20  |  30  |  40  |  50  |
   +------+------+------+------+------+
   Front                           Rear
   ```

2. **Dequeue Operation**:

   - Removes the element from the front.
   - After dequeuing 10:

   ```
   +------+------+------+------+
   |  20  |  30  |  40  |  50  |
   +------+------+------+------+
   Front                 Rear
   ```

## Diagrammatic Representation:

```plaintext
Initial Queue (Enqueue Operations):
          +-------+ Enqueue -> +-------+ Enqueue -> +-------+
[Front]   |  10   |            |  20   |            |  30   | [Rear]
          +-------+            +-------+            +-------+

After Dequeue (Dequeue Operations):
         +-------+ Dequeue -> +-------+ Dequeue -> +-------+
[Front]  |  20   |            |  30   |            | Empty | [Rear]
         +-------+            +-------+            +-------+
```

[Back to TOC](#table-of-contents)

---

# [Tree](tree)

- A **Tree** is non-linear data structure used for storing data,often used to represent hierarchical structure with a parent node called root and many levels of additional nodes.
- Unlike arrays, linked lists, stacks, and queues, which are linear structures, trees are hierarchical, consisting of nodes connected by edges.
- It is made up of nodes and edges without having any cycle. Each node in a ttree can point to n number of nodes in a tree.
- The topmost node is called the root, and each node can have multiple child nodes.

[Back to TOC](#table-of-contents)

## Key Concepts

- **Node**: Each element in a tree is called a node. It contains data and references (or pointers) to its child nodes.
- **Root**: The topmost node in the tree, which does not have a parent.
- **Parent**: A node that has one or more child nodes.
- **Child**: A node directly connected to its parent when moving away from the root.
- **Leaf**: A node with no children.
- **Subtree**: A tree formed by a node and its descendants.
- **Depth**: The number of edges from the root node to a given node.
- **Height**: The number of edges on the longest path from a node to a leaf.
- **Degree**: The number of children a node has.
- **Edge**: The connection between one node and another.

```plaintext
                      +----------------------+
                      |        [Root]        |
                      |     (Depth: 0)       |
                      |     (Degree: 2)      |
                      +----------+-----------+
                                 |
               +-----------------+-----------------+
               |                                   |
      +--------+--------+                  +-------+-------+
      |      [A]       |                  |      [B]      |
      | (Depth: 1)     |                  | (Depth: 1)    |
      | (Degree: 2)    |                  | (Degree: 1)   |
      +--------+--------+                  +-------+-------+
               |                                    |
        +------+-------+                  +---------+---------+
        |              |                  |
   +----+----+   +-----+-----+    +------+-----+
   |   [C]   |   |    [D]    |    |     [E]     |
   |(Depth: 2)|   |(Depth: 2) |   | (Depth: 2)  |
   |(Degree: 0)|   |(Degree: 0)|  | (Degree: 0) |
                                  |     (Leaf)  |
   +----+-----+    +-----+-----+    +------+------+
        |                   |
   +----+----+        +----+----+
   |   [F]     |      |   [G]     |
   | (Leaf)    |      | (Leaf)    |
   |(Degree: 0)|      |(Degree: 0)|
    |(Depth: 3)|      |(Depth: 3) |
   +-----------+      +-----------+
```

[Back to TOC](#table-of-contents)

## **Binary Tree**

A **Binary Tree** is a type of tree in which each node has at most two children, referred to as the **left child** and the **right child**.

#### Example:

```
        [1]
       /   \
     [2]   [3]
    /   \     \
  [4]   [5]   [6]
```

- Node **1** is the root.
- Nodes **2** and **3** are children of **1**.
- Nodes **4** and **5** are children of **2**.
- Node **6** is children of **3**.
- Nodes **4** , **5** and **6** are leaf nodes.

## **Tree Traversal**

Traversal refers to visiting all the nodes in a tree systematically. There are three main types of tree traversal:

### [In-order Traversal](tree/InOrderTraversal.java)

```
        [1]
       /   \
     [2]   [3]
    /   \     \
  [4]   [5]   [6]
```

The nodes are recursively visited in the following order: **Left child → Root → Right child**.

#### Example (in-order traversal of the Binary Search Tree):

```
[4] [2] [5] [1] [3] [6]
```

### [Pre-order Traversal](tree/PreOrderTraversal.java)

The nodes are recursively visited in the following order: **Root → Left child → Right child**.

#### Example (pre-order traversal of the Binary Search Tree):

```
[1], [2], [4], [5], [3], [6]
```

### [Post-order Traversal](tree/PostOrderTraversal.java)

The nodes are recursively visited in the following order: **Left child → Right child → Root**.

#### Example (post-order traversal of the Binary Search Tree):

```
 [4], [5], [2], [6], [3], [1]
```

### [Level Order Traversal ](tree/LevelOrderTraversal.java)

Order of Traversal: Level by Level

Level order traversal visits all nodes at the present depth level before moving on to nodes at the next depth level. This is typically done using a queue and is also known as breadth-first traversal.

**Example**:

```
      1
     / \
    2   3
   / \   \
  4   5   6
```

The level order traversal would yield:

```
1, 2, 3, 4, 5, 6
```

### Summary

| Traversal Method | Order of Traversal |
| ---------------- | ------------------ |
| Preorder         | Root, Left, Right  |
| Inorder          | Left, Root, Right  |
| Postorder        | Left, Right, Root  |
| Level Order      | Level by Level     |

[Back to TOC](#table-of-contents)

---

# Priority Queue

A **Priority Queue** is an abstract data type similar to a regular queue, but with an additional concept
of "priority" for each element. In a priority queue, each element is assigned a priority value,
and elements are dequeued based on their priority rather than their order in the queue.
Priority Queue is a data structure that allows us to find min/max element among a collection of elements in constant time.
supports following operations:

- insert(key)- inseart a key into priority queue
- deleteMax()/deleteMin()- return and remove largest/smallest key
- getMax()/getMin()-return largest/smallest key.

1. **Basic Concept**

- **Queue Structure**: In a typical queue (like a first-in-first-out (FIFO) structure), elements are
  dequeued in the order they are enqueued.
- **Priority Queue**: In a priority queue, every element has a priority, and elements with higher priority
  are dequeued before elements with lower priority. If two elements have the same priority,
  they are dequeued based on their order in the queue (FIFO behavior).

**Key Characteristics**

- **Priority Assignment**: Each element has an associated priority value. The lower or higher the number (depending on the implementation), the higher or lower the priority.
- **Operations**:
  - **Enqueue/Insert**: Insert an element into the priority queue with an associated priority.
  - **Dequeue/Extract**: Remove and return the element with the highest (or lowest) priority.
  - **Peek/Top**: Retrieve the element with the highest (or lowest) priority without removing it.
- **Ordering Rule**: Elements with higher priority are served before elements with lower priority.

  **Types of Priority Queues**

  - **Min-Priority Queue**: The element with the smallest priority value is dequeued first.
  - **Max-Priority Queue**: The element with the largest priority value is dequeued first.

  **Priority Queue Operations**
  Here are the common operations and their typical time complexities:

  | Operation            | Description                                                                | Time Complexity (using a Binary Heap) |
  | -------------------- | -------------------------------------------------------------------------- | ------------------------------------- |
  | **Insert (enqueue)** | Add an element to the priority queue with a given priority                 | O(log n)                              |
  | **ExtractMin/Max**   | Remove and return the element with the smallest (or largest) priority      | O(log n)                              |
  | **Peek (min/max)**   | Return the element with the smallest (or largest) priority without removal | O(1)                                  |
  | **Decrease Key**     | Decrease the priority of an element in the queue (for Min PQ)              | O(log n)                              |

**Implementation**
Priority queues can be implemented in several ways. Some common approaches include:

- **Binary Heap** (most common implementation):

  - A binary heap is a complete binary tree where each parent node’s value is less than (min-heap) or greater than (max-heap) the values of its children.
  - The binary heap is stored as an array, which allows for efficient insertion and extraction of the element with the highest priority in O(log n) time.
  - **Min-Heap**: This structure is used for implementing a min-priority queue.
  - **Max-Heap**: This structure is used for implementing a max-priority queue.

- **Unordered List**:

  - Insertion is O(1), but removing the element with the highest priority requires O(n) as you need to search through the entire list.

- **Ordered List**:

  - Insertion takes O(n) time (since we have to insert elements in the correct order), but extraction is O(1), as the highest priority element is always at the front.

- **Binary Search Trees (BSTs)**:
  - Operations are O(log n) on average but may degrade to O(n) in the worst case unless self-balancing trees (like AVL trees) are used.

**Priority Queue vs. Other Data Structures**

- **Priority Queue vs. Stack/Queue**:
  - **Stack**: Elements are processed in a Last-In-First-Out (LIFO) order, and there’s no notion of priority.
  - **Queue**: Elements are processed in a First-In-First-Out (FIFO) order. All elements have the same priority, unlike a priority queue.
- **Priority Queue vs. Heap**:
  - A heap is a specific implementation of a priority queue (binary heap), where elements are arranged based on their priorities.

---

# Binary Heap
