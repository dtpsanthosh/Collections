package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet();
		hs.add(56);
		hs.add(23);
		hs.add(67);
		hs.add(56);
		hs.add(null);
		hs.add(12);
		hs.add(34);
		System.out.println("Set:"+hs);
		hs.remove(67);
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains(45));
		System.out.println(hs.size());
		System.out.println("Set:"+hs);
		//hs.clear();
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
