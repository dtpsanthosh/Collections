package List;

import java.util.ArrayList;

public class ArrayL {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("a");
		al.add(2);
		al.add("b");
		al.add(null);
		al.add(2,"c");
		System.out.println(al); //[a, 2, c, b, null]
		al.remove(3);
		System.out.println(al); //[a, 2, c, null]
		al.addAll(al);
		System.out.println(al);//[a, 2, c, null, a, 2, c, null]
		
	}

}
