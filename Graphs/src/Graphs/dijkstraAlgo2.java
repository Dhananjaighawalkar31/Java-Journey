package Graphs;

import java.util.Scanner;

public class dijkstraAlgo2 {

    /* ───────────────────── pick the next unvisited vertex with min distance ───────────────────── */
    private static int findMinVertex(boolean[] visited, int[] distance) {
        int minVertex = -1;
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i] && (minVertex == -1 || distance[i] < distance[minVertex])) {
                minVertex = i;
            }
        }
        return minVertex;         // returns ‑1 if no reachable vertex remains
    }

    /* ───────────────────────── core Dijkstra (adjacency matrix, source = 0) ────────────────────── */
    private static void dijkstra(int[][] adjMatrix) {
        int n = adjMatrix.length;
        boolean[] visited = new boolean[n];
        int[] distance  = new int[n];

        distance[0] = 0;
        for (int i = 1; i < n; i++) distance[i] = Integer.MAX_VALUE;

        /* main loop: stop early if findMinVertex() returns ‑1 on disconnected graphs */
        for (int iter = 0; iter < n - 1; iter++) {
            int minVertex = findMinVertex(visited, distance);
            if (minVertex == -1) break;                     // ← guard fixes “silent crash”  :contentReference[oaicite:0]{index=0}

            visited[minVertex] = true;

            for (int j = 0; j < n; j++) {
                /* relax only real edges (weight > 0) and unvisited neighbours */
                if (adjMatrix[minVertex][j] > 0 && !visited[j]
                        && distance[minVertex] != Integer.MAX_VALUE) {
                    int newDist = distance[minVertex] + adjMatrix[minVertex][j];
                    if (newDist < distance[j]) distance[j] = newDist;
                }
            }
        }

        /* print results */
        for (int i = 0; i < n; i++) System.out.println(i + " " + distance[i]);
    }

    /* ─────────────────────────────── driver code: read graph ──────────────────────────────────── */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();   // number of vertices
        int e = s.nextInt();   // number of edges

        int[][] adjMatrix = new int[n][n];   // 0 = no edge

        for (int i = 0; i < e; i++) {
            int v1 = s.nextInt();
            int v2 = s.nextInt();
            int w  = s.nextInt();
            adjMatrix[v1][v2] = w;
            adjMatrix[v2][v1] = w;           // undirected graph
        }

        dijkstra(adjMatrix);
    }
}
