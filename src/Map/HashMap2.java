package Map;

import java.util.*;

public class HashMap2 {
	public static void main(String args[]) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Amit");
		map.put(104, "santhosh");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		map.put(103, "santhosh");
		map.put(100, "gsk");
		map.put(100,"gsk");
		map.put(105, null);
		map.put(null, "sanjeev");
//		System.out.println("Initial list of elements: " + map);
//		map.remove(100);
//		System.out.println("Updated list of elements: " + map);
//		map.remove(101);
//		System.out.println("Updated list of elements: " + map);
//		map.remove(102, "Rahul");
//		System.out.println("Updated list of elements: " + map);
		System.out.println("Key Set:"+map.keySet());
		System.out.println(map.containsKey(102));
		System.out.println(map.get(100));
		System.out.println(map);
	}
}