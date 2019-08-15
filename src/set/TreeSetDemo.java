package set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(56);
		ts.add(23);
		ts.add(67);
		ts.add(45);
		ts.add(12);
		ts.add(34);
		ts.add(34);
		//ts.add(null); //nullpointer exception null not allowed
		System.out.println("Set:"+ts);
		Iterator it=ts.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		}
}
