# Graph Traversal: BFS and DFS

## Introduction

Graph traversal involves visiting and exploring vertices in a graph.
Two common methods for graph traversal are Breadth-First Search (BFS) and Depth-First Search (DFS).

- **Breadth-First Search (BFS)**: BFS explores all neighbor vertices of a vertex before moving to the next level of neighbors. It traverses the graph in a level-order manner.
- **Depth-First Search (DFS)**: DFS explores as far as possible along each branch before backtracking. Just like preorder traversal of graph.

1. Visiting a vertex (going on particular vertex)
2. Exploration of vertex (If I am on particular vertex visiting all adjacent vertex)

## Diagram Illustration

        1
    /   \

2 3
/ \ / \
 4 5 6 7

### Traversal Orders

#### Breadth-First Search (BFS)

BFS explores nodes level by level:

1. **Level 1:** 1
2. **Level 2:** 2, 3
3. **Level 3:** 4, 5, 6, 7

Traversal order: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7

#### Depth-First Search (DFS)

DFS explores each branch completely before moving on to the next branch:

1. Start at 1
2. Visit 2
3. Visit 4
4. Visit 5
5. Backtrack to 2
6. Visit 3
7. Visit 6
8. Visit 7

Traversal order: 1 -> 2 -> 4 -> 5 -> 3 -> 6 -> 7

These traversal orders demonstrate the difference in exploration strategy between BFS and DFS on the provided graph.
