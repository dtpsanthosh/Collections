package List;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
public class Vector1 {
	public static void main(String args[]) {
		Vector<String> v = new Vector<String>();
		v.add("gsk");
		v.add("santhosh");
		v.add("kumar");
		v.add("Gummani");
		v.addElement("hai");
		System.out.println(v.elementAt(0));
		System.out.println(v.get(2));
		Iterator<String> itr = v.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("capacity:-"+v.capacity());
		Enumeration<String> e=v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}