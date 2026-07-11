package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class isConnected {
	
	private static boolean isConnected(int[][] edge) {
		boolean[] visited = new boolean[edge.length];
		DFS(edge,0,visited);
		for(int i = 0;i<visited.length;i++) {
			if(!visited[i]) {
				return false;
			}
		}
		return true;
	}
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static void DFS(int[][] edge, int sv, boolean[] visited) {
		visited[sv] = true;
		for(int i = 0 ;i < edge.length;i++) {
			if(edge[sv][i] == 1 && ! visited[i]) {
				DFS(edge,i,visited);
				visited[i] = true;
			}
		}
		
	}

	public static void main(String[] args) throws IOException {
		String[] strNums;
		strNums = br.readLine().split("\\s");
		int n = Integer.parseInt(strNums[0]);
		int e = Integer.parseInt(strNums[1]);

		if(n==0) {
			System.out.println(true);
			return ;
		}

		int edges[][] = new int[n][n];

		for(int i = 0;i<e;i++) {
			String[] strNums1;
			strNums1 = br.readLine().split("\\s");
			int fv = Integer.parseInt(strNums1[0]);
			int sv = Integer.parseInt(strNums1[1]);
			edges[fv][sv] = 1;
			edges[sv][fv] = 1;
		}

		System.out.println(isConnected(edges));

	}

}
