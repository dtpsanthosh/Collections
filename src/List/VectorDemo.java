package List;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		v.add(new Integer(11));
		v.add(new Integer(22));
		v.add(new Integer(33));
		v.add(55);
		v.add(66);	
		v.add(1,99);
		System.out.println("List:"+v);
		v.remove(new Integer(22));
		v.remove(1);
		System.out.println("List using for loop:");
		for(int i=0;i<=v.size();i++) {
		//	System.out.println(v.get(i)+"");
		}
		System.out.println("\n List using for each loop:");
		for(int x:v) {
			System.out.println(x+"");
		}
		ListIterator lit=v.listIterator();
		System.out.println("\n forward direction:");
		while(lit.hasNext()) {
			System.out.println(lit.next()+"");
		}
		System.out.println("\nbackword direction:");
		while(lit.hasPrevious()) {
			System.out.println(lit.previous()+"");
		}
	}

}
