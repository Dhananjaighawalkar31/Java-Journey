package Graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graph {
	
	private static void dftraversal(int[][] adjMatrix) {
		boolean visited[] = new boolean[adjMatrix.length];
		for(int i = 0;i<adjMatrix.length;i++) {
			if(!visited[i]) {
				dftraversal(adjMatrix,i,visited);
				System.out.println();
			}
		}
	}


	private static void dftraversal(int[][] adjMatrix, int currentVertex, boolean[] visited) {
		visited[currentVertex] = true;
		System.out.print(currentVertex + " ");
		for(int i = 0;i<adjMatrix.length;i++) {
			if(adjMatrix[currentVertex][i] == 1 && visited[i] == false) {
				dftraversal(adjMatrix,i,visited);
			}
		}
	}

	public static void bftraversal(int adjMatrix[][]) {
		Queue<Integer> pendingVertices = new LinkedList<>();
		boolean visited[] = new boolean[adjMatrix.length];
		visited[0] = true;
		pendingVertices.add(0);
		
		while(!pendingVertices.isEmpty()) {
			int currentVertex = pendingVertices.poll();
			System.out.println(currentVertex + " ");
			for(int i = 0;i<adjMatrix.length;i++) {
				if(adjMatrix[currentVertex][i] == 1 && !visited[i]) {
					pendingVertices.add(i);
					visited[i] = true;
				}
			}
		}
	}
	public static ArrayList<Integer> getPathDFS(int[][] edges,int sv,int ev){
		boolean visited[] = new boolean[edges.length];
		return getPathDFShelper(edges,sv,ev,visited);
	}
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	private static ArrayList<Integer> getPathDFShelper(int[][] edges, int sv, int ev, boolean[] visited) {
		if(sv == ev) {
			ArrayList<Integer> ans = new ArrayList<>();
			ans.add(sv);
			return ans;
		}
		visited[sv] = true;
		int n = edges.length;
		for(int i = 0;i<n;i++) {
			if(edges[sv][i] == 1 && !visited[i]) {
				ArrayList<Integer> smallAns = getPathDFShelper(edges,i,ev,visited);
				if(smallAns != null ) {
					smallAns.add(sv);
					return smallAns;
				}
			}
		}
		return null;
	}


	public static ArrayList<Integer> getPathBFS(int adjMatrix[][] , int s,int e){
		Queue<Integer> pendingVertices = new LinkedList<>();
		HashMap<Integer,Integer> map= new HashMap<>();
		boolean visited[] = new boolean[adjMatrix.length];
		visited[s] = true;
		pendingVertices.add(s);
		map.put(s,  -1);
		boolean pathFound = false;
		while(!pendingVertices.isEmpty()) {
			int currentVertex = pendingVertices.poll();
			for(int i = 0;i<adjMatrix.length;i++) {
				if(adjMatrix[currentVertex][i] == 1 && !visited[i]) {
					pendingVertices.add(i);
					visited[i] = true;
					map.put(i, currentVertex);
					if( i == e) {
						pathFound = true;
						break;
					}
				}
			}
		}
		if(pathFound) {
			ArrayList<Integer> path = new ArrayList<Integer>();
			int currentIndex = e;
			while(currentIndex != -1) {
				path.add(currentIndex);
				int parent = map.get(currentIndex);
				currentIndex = parent;
				
			}
			return path;
		}else {
			return null;
		}
	}
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int e = s.nextInt();
		int adjMatrix[][] = new int[n][n];
		for(int i = 0;i<e;i++) {
			int v1 = s.nextInt();
			int v2 = s.nextInt();
			adjMatrix[v1][v2] = 1;
			adjMatrix[v2][v1] = 1;
		}
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				System.out.print(adjMatrix[i][j] + " ");
			}
			System.out.println();
		}
		dftraversal(adjMatrix);
		bftraversal(adjMatrix);
	}

	
}
