package set;

import java.util.*;

public class LinkedHashSetDemo {
	public static void main(String args[]) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("santhosh");
		set.add("tharun");
		set.add("santhosh");
		set.add("chandra");
		set.add(null);
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}