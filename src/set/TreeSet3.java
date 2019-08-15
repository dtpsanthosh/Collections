package set;

import java.util.*;  
class TreeSet3{  
 public static void main(String args[]){  
  TreeSet<String> set=new TreeSet<String>();  
         set.add("A");  
         set.add("E");  
         set.add("C");  
         set.add("D");  
         set.add("a");
         set.add("B");  
         set.add("B"); // duplicates not allowed
         System.out.println("Initial Set: "+set);  
         System.out.println("Reverse Set: "+set.descendingSet()); // DESCENDING ORDER  
         System.out.println("Head Set: "+set.headSet("C", true));  // c before elements
         System.out.println("SubSet: "+set.subSet("B", false, "E", true)); //between b and e 
         System.out.println("TailSet: "+set.tailSet("C", false));  // after c elements
 }  
}  