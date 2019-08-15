package set;

public class ComparableInterface {
	public static void main(String[] args) {
		System.out.println("A".compareTo("Z")); // returns -ve value iff obj1(A) has to be come before obj2(Z)
		System.out.println("Z".compareTo("G")); // returns +ve value iff obj1(A) has to be come after obj2(G)
		System.out.println("A".compareTo("A")); // returns 0 value iff obj1(A) and before obj2(A) are equal
		// System.out.println("A".compareTo(null)); //java.lang.NullPointerException
	}
}
