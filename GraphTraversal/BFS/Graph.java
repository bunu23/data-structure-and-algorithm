package algo;

import java.util.*;

public class Graph {
    private int V; // Number of vertices
    private LinkedList<Integer> adjacencyList[];

    // Constructor
    public Graph(int v) {
        V = v;
        adjacencyList = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adjacencyList[i] = new LinkedList();
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w) {
        adjacencyList[v].add(w);
    }

    // Getters
    public int getV() {
        return V;
    }

    public LinkedList<Integer>[] getAdjacencyList() {
        return adjacencyList;
    }
}
