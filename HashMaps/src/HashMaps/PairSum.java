package HashMaps;

import java.util.HashMap;

public class PairSum {

	public static void main(String[] args) {
		int[] input = {2,-2,6,3,-6,2,-2};
		int size = input.length;
		int sum = PairSum(input,size);
		System.out.println(sum);
	}

	private static int PairSum(int[] input, int size) {
		HashMap<Integer,Integer> h = new HashMap<>();
		int finalCount = 0;
		for(int i = 0;i<size;i++) {
			int key = input[i];
			if(h.containsKey(key)) {
				int value = h.get(key);
				h.put(key, value+1);
			}else {
				h.put(key, 1);
			}
		}
		for(int i = 0;i<size;i++) {
			int key = input[i];
			if(h.containsKey(-key) && h.get(key) != 0) {
				int times;
				if(key == (-key)) {
					int occurences = h.get(key);
					times = (occurences * (occurences - 1))/ 2 ;
					finalCount = finalCount + times;
					h.put(key, 0);
					continue;
				}
				
				times = h.get(key) * h.get(-key);
				finalCount = finalCount+times;
				h.put(key, 0);
				h.put(-key, 0);
			}
		}
		return finalCount;
	}

}
