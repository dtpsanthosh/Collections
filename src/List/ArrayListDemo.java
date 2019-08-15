package List;
import java.util.*;

class ArrayListDemo {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("nokia");
		list.add("samsung");
		list.set(1, "sony");
		list.add(null);
		list.add(2,"red");
		list.add("htc");
		System.out.println("List:"+list);
		list.remove("nokia");
//		//list.remove(1);
		System.out.println("List:"+list);
		System.out.println("Size:"+list.size());
		/*Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		System.out.println("List:"+list);
	}
}