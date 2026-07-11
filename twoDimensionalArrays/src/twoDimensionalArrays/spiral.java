package twoDimensionalArrays;

public class spiral {
	public static void spiralPrint(int mat[][]) {
		int nRows = mat.length;
		if (nRows == 0) {
			return;
		}
		int mCols = mat[0].length;
		
		int i, rowStart = 0, colStart = 0;
		
		int numElements = nRows * mCols, count = 0;
		
		while(count < numElements) {
			for(i = colStart; count < numElements && i<mCols; ++i) {
				System.out.println(mat[rowStart][i]+ " ");
				count++;
			}
			rowStart++;
			
			for(i = rowStart; count < numElements && i<nRows; ++i) {
				System.out.println(mat[i][mCols - 1]+ " ");
				count++;
			}
			mCols--;
			
			for(i = mCols - 1; count < numElements && i >= colStart; --i) {
				System.out.println(mat[nRows - 1][i]+ " ");
				count++;
			}
			nRows--;
			
			for(i = nRows; count < numElements && i>= rowStart; --i) {
				System.out.println(mat[i][colStart]+ " ");
				count++;
			}
			colStart++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = {
		        {1, 2, 3},
		        {4, 5, 6},
		        {7, 8, 9}
		    };
		    spiralPrint(mat);

	}

}
