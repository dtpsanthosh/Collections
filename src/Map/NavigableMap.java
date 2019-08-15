package Map;

import java.util.TreeMap;

public class NavigableMap {

	public static void main(String[] args) {
		TreeMap<Integer, Integer> t=new TreeMap<>();
		t.put(56, 40);
		t.put(89, 10);
		t.put(67, 50);
		t.put(45, 80);
		t.put(23, 70);
		t.put(78, 30);
		t.put(12, 60);
		t.put(34, 20);
		System.out.println("Map:"+t);
		System.out.println(t.lowerEntry(34));
		System.out.println(t.floorEntry(56));
		System.out.println(t.higherEntry(56));
		System.out.println(t.ceilingEntry(56));
		System.out.println(t.lowerKey(56));
		System.out.println(t.floorKey(56));
		System.out.println(t.higherKey(56));
		System.out.println(t.ceilingKey(56));
		System.out.println(t.firstEntry());//12=60
		System.out.println(t.pollLastEntry());//89=10
		System.out.println(t.subMap(45,78));//{45=80, 56=40, 67=50}
		System.out.println(t.headMap(56));//{12=60, 23=70, 34=20, 45=80}
		System.out.println(t.tailMap(56));//{56=40, 67=50, 78=30}
		System.out.println(t.descendingMap());//{78=30, 67=50, 56=40, 45=80, 34=20, 23=70, 12=60}
	}

}
