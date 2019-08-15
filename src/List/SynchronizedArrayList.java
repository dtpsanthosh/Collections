package List;

import java.util.*;
import java.util.Collection;
import java.util.Collections;

public class SynchronizedArrayList {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		List l=Collections.synchronizedList(al);
		l.add("santhosh");
		l.add("hari");
		System.out.println("Before Adding Index Elements:"+l);
		l.add(1,"gsk");
		System.out.println("After Adding Index Element:"+l);
		l.clear();
	//	l.removeAll(l);
		System.out.println(l);
		
	}
}
