package set;

import java.util.TreeSet;

class Student implements Comparable{
	int rollNo;
	Student(int rollNo){
		this.rollNo=rollNo;
	}
	public int compareTo(Object obj) {
		Student s=(Student)obj;
		if(this.rollNo<s.rollNo)
			return -12;
		else if(this.rollNo>s.rollNo)
			return 12;
		else
			return 0;
	}
	public String toString() {
		return""+rollNo;
	}
}
public class ComparableDemo {

	public static void main(String[] args) {
		TreeSet<Student> ts=new TreeSet<Student>();
		ts.add(new Student(14));
		ts.add(new Student(11));
		ts.add(new Student(15));
		ts.add(new Student(13));
		ts.add(new Student(16));
		ts.add(new Student(12));
		System.out.println("Set:"+ts);
	}

}
