package Map;
import java.util.*;
class Hashtable1 {
	public static void main(String args[]) {
		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
		hm.put(100, "gsk");
		hm.put(102, "Ravi");
		hm.put(101, "hari");
		hm.put(101, "tharun");
		//hm.put(null, "tharun");// doesn't allow null key
		// hm.put(104,null); doesn't allow null value
		System.out.println(hm.get(100));
		System.out.println(hm.containsValue("Ravi"));
		System.out.println("Elements:"+hm);
		Enumeration e=hm.keys();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}