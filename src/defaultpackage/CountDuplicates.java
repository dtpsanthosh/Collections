package defaultpackage;

import java.util.ArrayList;
import java.util.HashSet;

public class CountDuplicates {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Santosh");
		al.add("Saket");
		al.add("Saket");
		al.add("Shyam");
		al.add("Santosh");
		al.add("Shyam");
		al.add("Santosh");
		al.add("Santosh");
		HashSet<String> hs = new HashSet<String>();
		hs.addAll(al);
		int totalDuplicates =al.size() - hs.size();
		System.out.println(totalDuplicates);
		
	}

}
