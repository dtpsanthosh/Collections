package Map;

import java.util.*;  
public class HasMapReplace{  
 public static void main(String args[]){  
   HashMap<Integer,String> hm=new HashMap<Integer,String>();    
      hm.put(100,"santhosh");    
      hm.put(101,"Vijay");    
      hm.put(102,"Rahul");   
      System.out.println("Initial list of elements:");  
     for(Map.Entry m:hm.entrySet())  
     {  
        System.out.println(m.getKey()+" "+m.getValue());   
     }  
     System.out.println("Updated list of elements:");  
     hm.replace(102, "gsk");  
     for(Map.Entry m:hm.entrySet())  
     {  
        System.out.println(m.getKey()+" "+m.getValue());   
     }  
     System.out.println("Updated list of elements:");  
     hm.replace(101, "Vijay", "Ravi");  
     for(Map.Entry m:hm.entrySet())  
     {  
        System.out.println(m.getKey()+" "+m.getValue());   
     }   
     System.out.println("Updated list of elements:");  
     hm.replaceAll((k,v) -> "Ajay");  
     for(Map.Entry m:hm.entrySet())  
     {  
        System.out.println(m.getKey()+" "+m.getValue());   
     }  
 }  
}  