package practice;

public class ObstacleGridProblem {

	public static void main(String[] args) {
		int[][] grid = {{0,0,0},{0,1,0},{0,0,0}};
		uniquePaths(grid);

	}

	private static void uniquePaths(int[][] grid) {
		findPaths(grid,0,0,"");
		
	}

	private static void findPaths(int[][] grid, int i, int j, String p) {
		if(i>=grid.length||j>=grid[0].length||grid[i][j] == 1) {
			return;
		}
		if(i==grid.length - 1 && j==grid[0].length - 1) {
			System.out.println(p);
			return;
		}
		findPaths(grid,i+1,j,p + "D");
		findPaths(grid,i,j+1,p+ "R");
		
	}

}
