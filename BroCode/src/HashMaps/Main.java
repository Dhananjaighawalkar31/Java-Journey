package HashMaps;

import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		
		HashMap<String, Double> map = new HashMap<>();

		map.put("apple",0.50);
		
		map.put("Orange", 0.75);
		
		map.put("banana", 0.25);
		
		map.put("coco", 2.5);
		
//		map.remove("apple");
//		System.out.println(map.get("coco"));
//		System.out.println(map.containsKey("banana"));
///		System.out.println(map.containsValue(0.75));
//		System.out.println(map.size());
		
		for(String key : map.keySet()) {
			 System.out.println(key + " : $" + map.get(key));
		}
		
	}
}
