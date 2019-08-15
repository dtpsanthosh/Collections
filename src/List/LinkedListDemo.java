package List;
import java.util.Iterator;
import java.util.LinkedList;

class Student{
	int rollNo;
	 Student(int rollNo) {
		 this.rollNo=rollNo;
	}
	 public String toString() {
		 return""+rollNo;
	 }
}
public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Student> ll=new LinkedList<Student>();
		ll.add(new Student(34));
		ll.add(new Student(12));
		ll.add(new Student(56));
		ll.add(new Student(90));
		ll.add(new Student(78));
		ll.add(new Student(45));
		System.out.println("List:"+ll);
		ll.remove(2);
		System.out.println("List:"+ll);
		Iterator it=ll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
