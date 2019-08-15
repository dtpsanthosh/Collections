package Map;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, Integer>hm=new HashMap<String,Integer>();
		hm.put("mnop", 40);
		hm.put(null, null);
		hm.put("pqrs", null);
		hm.put("qwer", 60);
		hm.put("stuv", 50);
		hm.put("ghij", 30);
		System.out.println("Elements:"+hm);
		hm.remove("stuv");
	//	System.out.println("Elements:"+hm);
		Set s=hm.keySet();
	//	System.out.println("Keys:"+s);
		Iterator it=s.iterator();
		while(it.hasNext()) {
			String str=(String) it.next();
			System.out.println(str+":"+hm.get(str));
					}
		Collection<Integer> c=hm.values();
		Iterator<Integer> v=c.iterator();
		while(v.hasNext()) {
			System.out.println(v.next());
		}
		System.out.println("values:"+c);
	System.out.println(hm.containsKey("abcd"));
	System.out.println(hm.containsValue(50));
	}

}
