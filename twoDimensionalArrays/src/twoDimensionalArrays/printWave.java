package twoDimensionalArrays;

public class printWave {
	public static void wavePrint(int mat[][]) {
		
		int nRows = mat.length;
		if(nRows == 0) {
			return;
		}
		int mCols = mat[0].length;
		for(int j = 0; j<mCols;j++) {
			if(j % 2 == 0) {
				for(int i = 0; i< nRows;i++) {
					System.out.print(mat[i][j] + " ");
				}
			}
			else {
				for(int i = nRows - 1; i >= 0; i-- ) {
					System.out.print(mat[i][j] + " ");
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = {
		        {1, 2, 3},
		        {4, 5, 6},
		        {7, 8, 9}
		    };
		    wavePrint(mat);

	}

}
