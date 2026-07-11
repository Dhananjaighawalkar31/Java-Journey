package timeCompplexity;

import java.util.Arrays;

public class triplets {
	public static int tripletSum(int[] arr, int num) {
		Arrays.sort(arr);
		int n = arr.length;
		
		int numTriplets = 0;
		
		for(int i = 0;i < n; i++) {
			int pairSumFor = num - arr[i];
			int numPairs = pairSum(arr, (i+1), (n - 1), pairSumFor);
			
			numTriplets += numPairs;
		}
		return numTriplets;
		
	}
	
	
	
	public static int pairSum(int[] arr, int startIndex, int endIndex, int num) {
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
		// TODO Auto-generated method stub
		int[] arr = { 0, 1, 2, 3, 3};
		int num = 6;
		int result = tripletSum(arr , num);
		System.out.println(result);
	}

}
