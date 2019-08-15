package defaultpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class howMany2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("hai");
		list.add("hai");
		list.add("bye");
		// we can also use Function.identity() instead of c->c
		Map<String, Long> map = list.stream().collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		map.forEach((k, v) -> System.out.println(k + " : " + v));
	}
}