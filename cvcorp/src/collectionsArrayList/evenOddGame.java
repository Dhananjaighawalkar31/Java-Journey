package collectionsArrayList;

import java.util.Arrays;

public class evenOddGame {


	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
		int[] arr2 = {5,9,10,7,3,2};

		playGame(arr1);
		playGame(arr2);
	}

	static void playGame(int[] arr) {
		int left = 0, right = arr.length - 1;
		int p1 = 0, p2 = 0;
		boolean turnP1 = true; 
		boolean takeFromLeft = true; 
		
		while (left <= right) {
			int picked;
			if (takeFromLeft) {
				picked = arr[left++];
			} else {
				picked = arr[right--];
			}


			if (turnP1) {
				p1 += picked;
			} else {
				p2 += picked;
			}


			if (picked % 2 == 0) {
				takeFromLeft = !takeFromLeft;
			}


			turnP1 = !turnP1;
		}

		System.out.println("Array: " + Arrays.toString(arr));
		System.out.println("P1 = " + p1);
		System.out.println("P2 = " + p2);
		System.out.println("-----------------");
	}
}

