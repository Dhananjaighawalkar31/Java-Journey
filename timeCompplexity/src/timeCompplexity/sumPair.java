package timeCompplexity;

import java.util.Arrays;

public class sumPair {
	public static int pairSum(int[] arr, int num) {
		Arrays.sort(arr);
		int startIndex = 0;
		int endIndex = arr.length - 1;

		int numPair = 0;
		while(startIndex < endIndex) {
			if(arr[startIndex] + arr[endIndex] < num) {
				startIndex++;
			}
			else if(arr[startIndex] + arr[endIndex] > num) {
				endIndex--;
			} else {
				int elementAtStart = arr[startIndex];
				int elementAtEnd = arr[endIndex];

				if (elementAtStart == elementAtEnd) {
					int totalElementFromStartToEnd = (endIndex - startIndex) + 1;
					numPair += (totalElementFromStartToEnd * (totalElementFromStartToEnd - 1) / 2);

					return numPair;
				}

				int tempStartIndex = startIndex + 1;
				int tempEndIndex = endIndex - 1;

				while(tempStartIndex <= tempEndIndex && arr[tempStartIndex] == elementAtStart) {
					tempStartIndex++;
				}
				while(tempEndIndex >= tempStartIndex && arr[tempEndIndex] ==  elementAtEnd) {
					tempEndIndex--;
				}

				int totalELementFromStart = (tempStartIndex - startIndex);
				int totalElementfromEnd = (endIndex - tempEndIndex);

				numPair += (totalELementFromStart * totalElementfromEnd);

				startIndex = tempStartIndex;
				endIndex = tempEndIndex;

			}

		}
		return numPair;




	}

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 3, 3};
		int num = 5;
		int result = pairSum(arr , num);
		System.out.println(result);

	}

}
