package List;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(50);
		s.push(20);
		s.push(40);
		s.push(null);
		s.push(20);
		s.push(60);
		s.push(300);
		System.out.println("List:" + s);
		System.out.println(s.peek());
		System.out.println("List:" + s);
		System.out.println(s.pop());
		System.out.println("List:" + s);
		System.out.println(s.empty());
		System.out.println(s.size());
		System.out.println(s.search(40));
	}
}
