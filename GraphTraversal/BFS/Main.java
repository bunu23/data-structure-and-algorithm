package algo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a graph
        Graph graph = new Graph(4);

        // Add edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        // Perform BFS starting from vertex 2
        BFS bfs = new BFS();
        System.out.println("BFS starting from vertex 2:");
        bfs.BFS(graph, 2);
    }
}
