package set;

import java.util.*;
public class LinkedHashSet1 {
	public static void main(String args[]) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(56);
		lhs.add(56);
		lhs.add(23);
		lhs.add(null);
		lhs.add(67);
		lhs.add(45);
		lhs.add(12);
		lhs.add(34);
		System.out.println("Set:"+lhs);
		lhs.remove(67);
		System.out.println("Set:"+lhs);
		Iterator it = lhs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}