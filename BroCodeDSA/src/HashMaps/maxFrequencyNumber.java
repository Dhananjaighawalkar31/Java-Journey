package HashMaps;

import java.util.HashMap;

public class maxFrequencyNumber {

	public static void main(String[] args) {
		int arr[] = {1,2,3,1,1,2,2,3,3,3};
		System.out.println(maxFrequencyNumber(arr));
	}

	private static int maxFrequencyNumber(int[] arr) {
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i:arr) {
			hm.put(i, hm.getOrDefault(i,0) + 1);
		}
		int max = 0, ans = Integer.MIN_VALUE;
		for(int i : arr) {
			if(hm.get(i)>max) {
				max = hm.get(i);
				ans = i;
			}
		}
		return ans;
	}

}
