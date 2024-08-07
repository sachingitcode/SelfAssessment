package com.dsa.graphs;

import java.util.Arrays;


public class PrimsAlgo {
    private static final int INF = Integer.MAX_VALUE;

    // Function to find the vertex with the minimum key value
    private int minKey(int[] key, boolean[] mstSet, int V) {
        int min = INF, minIndex = -1;
        for (int v = 0; v < V; v++) {
            if (!mstSet[v] && key[v] < min) {
                min = key[v];
                minIndex = v;
            }
        }
        return minIndex;
    }

    // Function to print the constructed MST stored in parent[]
    private void printMST(int[] parent, int V, int[][] graph) {
        System.out.println("Edge \tWeight");
        for (int i = 1; i < V; i++) {
            System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]);
        }
    }

    // Function to construct and print MST using Prim's algorithm
    public void primMST(int[][] graph, int V) {
        int[] parent = new int[V]; // Array to store the MST
        int[] key = new int[V];    // Key values used to pick minimum weight edge in cut
        boolean[] mstSet = new boolean[V]; // To represent set of vertices included in MST

        // Initialize all keys as INFINITE
        Arrays.fill(key, INF);

        // Always include the first vertex in MST.
        key[0] = 0; // Make key 0 so that this vertex is picked as the first vertex
        parent[0] = -1; // First node is always root of MST

        // The MST will have V vertices
        for (int count = 0; count < V - 1; count++) {
            // Pick the minimum key vertex from the set of vertices not yet included in MST
            int u = minKey(key, mstSet, V);

            // Add the picked vertex to the MST Set
            mstSet[u] = true;

            // Update key value and parent index of the adjacent vertices of the picked vertex
            for (int v = 0; v < V; v++) {
                // Update the key only if graph[u][v] is smaller than key[v]
                if (graph[u][v] != 0 && !mstSet[v] && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            }
        }

        // Print the constructed MST
        printMST(parent, V, graph);
    }

    public static void main(String[] args) {
        /* Let us create the following graph
               2    3
            (0)--(1)--(2)
             |   / \   |
            6| 8/   \5 |7
             | /     \ |
            (3)-------(4)
                  9          */
        PrimsAlgo prim = new PrimsAlgo();
        int graph[][] = new int[][]{
                {0, 2, 0, 6, 0},
                {2, 0, 3, 8, 5},
                {0, 3, 0, 0, 7},
                {6, 8, 0, 0, 9},
                {0, 5, 7, 9, 0}
        };

        // Number of vertices in the graph
        int V = graph.length;

        // Run Prim's algorithm
        prim.primMST(graph, V);
    }
}
