package twoDimensionalArrays;

public class rowWIseSum {
	public static void rowSum(int[][] mat) {
		int nRows = mat.length;
		
		if(nRows == 0) {
			return;
		}
		int mCols = mat[0].length;
		for(int i = 0;i<nRows;i++) {
			int rowSum = 0;
			for(int j = 0;j<mCols;j++) {
				rowSum += mat[i][j];
			}
			System.out.println(rowSum + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		rowSum(mat);

	}

}
