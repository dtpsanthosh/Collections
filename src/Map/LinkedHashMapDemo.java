package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
		lhm.put("mnop", 40);
		lhm.put("abcd", 80);
		lhm.put("pqrs", 70);
		lhm.put("qwer", 60);
		lhm.put("stuv", 50);
		lhm.put(null, null);
		lhm.put("stuv", null);
		lhm.put("stuv", 50);
		lhm.put(null, 30);
		System.out.println("Elements:" + lhm);
		lhm.remove("stuv");
		System.out.println("Elements:" + lhm);
		Set s = lhm.keySet();
		System.out.println("Keys:" + s);
		Iterator it = s.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			String str = (String) obj;
			System.out.println(str + "" + lhm.get(str));
		}
		Collection<Integer> c = lhm.values();
		System.out.println("values:" + c);

		System.out.println(lhm.containsKey("abcd"));
		System.out.println(lhm.containsValue(50));
	}

}
