package HashMaps;

import java.util.ArrayList;
import java.util.HashMap;

public class removeDuplicates {

	public static void main(String[] args) {
		int[] arr = {1,3,2,2,3,1,2,5,3,5,6};
		ArrayList<Integer> output = removeDuplicates(arr);
		System.out.println(output);

	}

	private static ArrayList<Integer> removeDuplicates(int[] arr) {
		ArrayList<Integer> output = new ArrayList<>();
		HashMap<Integer,Boolean> map = new HashMap<>();
		
		for(int i = 0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				continue;
			}
			output.add(arr[i]);
			map.put(arr[i], true);
		}
		return output;
	}

}
