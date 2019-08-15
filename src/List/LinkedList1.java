package List;
import java.util.LinkedList;
public class LinkedList1 {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add("gsk");
		ll.add(null);
		ll.add(10);
		//ll.set(2, "Hai");
		System.out.println(ll);
		ll.addLast("kumar");
		System.out.println("After Adding Last Element:"+ll);
		ll.addFirst("gummani");
		System.out.println("After Adding First Element:"+ll);
		ll.add(2, "santhosh");
		System.out.println("After Adding Element to 2nd Index"+ll);
		System.out.println("getFirst:"+ll.getFirst());
		System.out.println("4th index value:"+ll.get(4)+" "+"\nLast Value: "+ll.getLast());
		System.out.println("last index :"+ll.lastIndexOf("kumar"));
		System.out.println(ll.removeFirst());
		System.out.println("After Removing First Element:"+ll);
		System.out.println(ll.removeLast());
		System.out.println("After Removing The Last Element:"+ll);
		System.out.println(ll.contains("gsk"));
		System.out.println(ll.containsAll(ll));
	}

}
