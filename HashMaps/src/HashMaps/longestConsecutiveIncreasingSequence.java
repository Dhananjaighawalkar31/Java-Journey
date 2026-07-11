package HashMaps;

import java.util.ArrayList;
import java.util.HashMap;

public class longestConsecutiveIncreasingSequence {

	public static void main(String[] args) {
		int[] arr = {1, 9, 3, 10, 4, 20, 2};  // Example with unsorted input
        ArrayList<Integer> ans = longestConsecutiveIncreasingSequence(arr);
        System.out.println("Longest consecutive sequence: " + ans);
	}

	private static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
		HashMap<Integer,Boolean> visitedElements = new HashMap<>();
		HashMap<Integer,Integer> elementToIndexMapping = new HashMap<>();
		
		for(int i = 0;i<arr.length;i++) {
			int num = arr[i];
			elementToIndexMapping.put(num,i);
			
			if(!visitedElements.containsKey(num)) {
				visitedElements.put(num,false);
			}
		}
		
		ArrayList<Integer> longestSequence = new ArrayList<>();
		int globalMaxSequenceLength = 1;
		int globalMinStartIndex = 0;
		for(int i = 0;i<arr.length;i++) {
			int num = arr[i];
			int currentMinStartIndex = i;
			
			int count = 0;
			int tempNum = num;
			
			
			while(visitedElements.containsKey(tempNum) && !visitedElements.get(tempNum)) {
				visitedElements.put(tempNum, true);
				count++;
				tempNum++;
			}
			
			tempNum = num -1;
			while(visitedElements.containsKey(tempNum) && !visitedElements.get(tempNum)) {
				visitedElements.put(tempNum, true);
				count++;
				
				currentMinStartIndex = elementToIndexMapping.get(tempNum);
				tempNum--;
			}
			
			if(count > globalMaxSequenceLength) {
				globalMaxSequenceLength = count;
				globalMinStartIndex = currentMinStartIndex;
			}else if(count == globalMaxSequenceLength) {
				if(currentMinStartIndex < globalMinStartIndex) {
					globalMinStartIndex = currentMinStartIndex;
				}
			}
			
		}
		int globalStartNum = arr[globalMinStartIndex];
		
		longestSequence.add(globalStartNum);
		
		if(globalMaxSequenceLength>1) {
			longestSequence.add(globalStartNum + globalMaxSequenceLength - 1);
		}
		return longestSequence;
	}

}
