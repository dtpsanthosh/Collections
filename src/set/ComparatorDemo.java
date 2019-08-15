package set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>(new Comparator<Integer>() {
		public int compare(Integer i1,Integer i2) {
			if(i1>i2) 
				return 12;
			else if(i1<i2)
				return -12;
			else return 0;
		}
		});
		ts.add(56);
		ts.add(23);
		ts.add(67);
		ts.add(45);
		ts.add(12);
		ts.add(34);
		System.out.println("Set:"+ts);
		Iterator it=ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
