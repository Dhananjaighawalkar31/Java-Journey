package HashMaps;

import java.util.HashMap;

public class getPairsWIthDifferenceK {

	public static void main(String[] args) {
		int[] arr = {1,3,4,2,6,3,9};
		int k = 3;
		int ans = getPairsWIthDifferenceK(arr,k);
		System.out.println(ans);

	}

	private static int getPairsWIthDifferenceK(int[] arr, int k) {
		HashMap<Integer,Integer> map = new HashMap<>();
		int pairCount = 0;
		for(int i : arr) {
			int p1 = i + k;
			boolean flag = false;
			if(i == p1) {
				flag = true;
			}
			if(map.containsKey(p1)) {
				pairCount += map.get(p1);
			}
			int p2 = i -k;
			if(map.containsKey(p2) && !flag) {
				pairCount += map.get(p2);
			}
			if(map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			}else {
				map.put(i, 1);
			}
		}
		return pairCount;
	}

}
