package set;

import java.util.*;

public class TreeSet1 {
	public static void main(String args[]) {
		TreeSet<String> set = new TreeSet<String>();
		//set.add(null); // Not allowed 1.7 onwards 
		set.add("santhosh");
		set.add("hari");
		set.add("ravi");
		set.add("Harish");
		set.add("hari");
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}