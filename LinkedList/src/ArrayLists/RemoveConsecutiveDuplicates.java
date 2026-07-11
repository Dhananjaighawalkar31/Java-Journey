package ArrayLists;

import java.util.ArrayList;

public class RemoveConsecutiveDuplicates {
	public static ArrayList<Integer> removeConsecutiveDuplic(int arr[]){
		ArrayList<Integer> result = new ArrayList<>();
		result.add(arr[0]);
		for(int i = 1; i< arr.length; i++) {
			if(arr[i] != arr[i-1] ) {
				result.add(arr[i]);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int arr[] = {1,1,1,2,2,2,3,3,4,4,5,1};
		ArrayList<Integer> result = removeConsecutiveDuplic(arr);
		for(int i = 0; i <result.size(); i++) {
			System.out.println(result.get(i));
		}
		}

}
