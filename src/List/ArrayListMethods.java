package List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ArrayListMethods {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(56);
		al.add(23);
		al.add(67);
		al.add(89);
		al.add(34);
		al.add(78);
		al.add(12);
		al.add(45);
		System.out.println("List : " + al);
		Collections.reverse(al);
		System.out.println("Reverse List :"+al);
		Collections.sort(al);
		System.out.println("Sorting List :"+al);
		Collections.swap(al, 1, 4);
		System.out.println("swapping :"+al);
		System.out.println(Collections.min(al));
		System.out.println(Collections.max(al));
		List<Integer> l=Collections.synchronizedList(al);
		System.out.println("List :"+l);
	}

}
