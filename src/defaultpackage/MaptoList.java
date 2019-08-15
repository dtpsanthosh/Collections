package defaultpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MaptoList {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<>();
		map.put(10,"hai");
		map.put(20, "bye");
		map.put(30,"hello");
		map.put(30, "santhosh");
		List<Map<Integer,String>> list=new ArrayList<>();
		list.add(map);
		Iterator<Map<Integer,String>> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
