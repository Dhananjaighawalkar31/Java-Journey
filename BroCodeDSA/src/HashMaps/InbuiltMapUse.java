package HashMaps;

import java.util.HashMap;
import java.util.Set;

public class InbuiltMapUse {

	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		map.put("abc", 9);
		map.put("def", 2);
		System.out.println(map.size());
		
		if(map.containsKey("abc")) {
			System.out.println(" map has abc");
		}
		
		int v = map.get("abc");
		System.out.println(v);
		
//		map.remove("abc");
//		System.out.println(map.size());
		
//		Set<String> keys = map.keySet();
//		for(String s: keys) {
//			System.out.println(s);
//		}
	}

}
