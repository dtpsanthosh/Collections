package Map;

import java.util.*;

class TreeMap1 {
	public static void main(String args[]) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(100, "gsk");
		map.put(102, "Ravi");
		map.put(101, "hari");
		map.put(101, null);
		//map.put(null, "hari"); // null pointer exception
		map.put(103, "Harish");
		map.put(103, "kumar");
		//map.put(null,null);
		System.out.println("Elements:"+map);
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}