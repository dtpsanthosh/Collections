package List;
import java.util.*;

class ArrayList1 {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("santhosh");
		list.add("kumar");
		list.add("sanjeev");
		list.add("kumar");
		list.add(1, "gggg");
		list.add(1,"jjj");
		list.set(1, "har");
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}