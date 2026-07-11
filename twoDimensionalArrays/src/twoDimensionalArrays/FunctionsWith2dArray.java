package twoDimensionalArrays;

import java.util.Scanner;

public class FunctionsWith2dArray {
	public static void print2dArray(int[][] arr) {
		int rows = arr.length;

		for(int i=0;i<rows;i++) {
			int cols = arr[0].length;
			for(int j=0;j<cols;j++) {
				System.out.print(arr[i][j] + " ");
				
			}
			System.out.println();
		}
	}
	
	public static int[][] takeInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = s.nextInt();
		System.out.println("Enter the number of cols");
		int cols = s.nextInt();
		int[][] arr = new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.println("Enter the " + i  + "row" + j + "column" );
				arr[i][j] = s.nextInt();
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[][] input = takeInput();
		print2dArray(input);
		

	

	}
}