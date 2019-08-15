package set;

import java.util.*;

public class HashSetDemo1 {
	public static void main(String args[]) {
		HashSet<String> set = new HashSet<String>();
		set.add("santhosh");
		set.add("santhosh");//duplicates not allowed
		set.add("kumar");
		set.add(null);
		/*Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		System.out.println(set);
		System.out.println(set.add("kumar1")); // true
		System.out.println(set.add("kumar"));
		System.out.println(set.size());
		System.out.println(set);
	}
}