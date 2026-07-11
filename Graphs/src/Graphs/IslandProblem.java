package Graphs;

public class IslandProblem {
	public static int numConnected(int[][] edges,int n) {
		boolean[] visited = new boolean[n];
		int count = 0;
		for(int i = 0;i<n;i++) {
			if(visited[i] == false) {
				dfs(edges,i,visited,n);
				count++;
			}
		}
		return count;
	}

	private static void dfs(int[][] edges, int v1, boolean[] visited, int n) {
		visited[v1] = true;
		
		for(int i = 0;i<n;i++) {
			if(visited[i] == false && edges[v1][i] == 1) {
				dfs(edges, i , visited, n);
			}
		}
		
	}

	public static void main(String[] args) {
		int n = 5; // number of vertices
        int[][] edges = {
            {0, 1, 0, 0, 0},
            {1, 0, 1, 0, 0},
            {0, 1, 0, 1, 0},
            {0, 0, 1, 0, 1},
            {0, 0, 0, 1, 0}
        };

        int connectedComponents = numConnected(edges, n);
        System.out.println("Number of connected components: " + connectedComponents);
    }
	
		

	}


