package HashMapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
public class Map {
	public static void main(String[] args) {
		HashMap m= new HashMap();
		  System.out.println("before adding elements"+m);
		m.put(1,"grapes");  // put stored the  elements in hash map
		m.put(2, "orange");
		m.put(3,"cherry");
		//m.put(4," " );
		//m.put(5, " ");
		  System.out.println("after adding elements"+m);
	//  m.isEmpty();   // it returns the true/false
		//  System.out.println(m.isEmpty());
		//m.size();    // it returns the size of the hash map
		  System.out.println(m.size()); 
//		m.put(4," pineapple");
//		  System.out.println("after adding elements"+m);
          System.out.println(m.get(1));
//         //another object 
		HashMap hash=new HashMap();
		hash.put(5,"watermelon");
		hash.put(null, "hash");
		hash.put(6, "null");
		hash.put(7,"null");
         System.out.println("after adding "+hash);
//        m.remove(4);
//          System.out.println(m);
//        hash.put(6,"banana");
//          System.out.println( hash.containsValue("manu")); //check the value present or not
//          System.out.println(m.keySet());  // it shows the key value only
//          System.out.println(m.values());   // it returns the values only 
//          System.out.println(m.entrySet());// it shows the hashmap values
//       m.putIfAbsent(7,"apple");  //one value is fixed it can't change
//          System.out.println(m);
//       m.putIfAbsent(7,"mango");
//          System.out.println(m);
//       m.replace(2,"manu");    //replace the values
//          System.out.println(m); 
//       hash.putAll(m);   // copy the elements one map to anothe map
//          System.out.println(hash);
//      
//      //fetching
      Set s=hash.entrySet();
      Iterator ii= s.iterator();
      for(;ii.hasNext();)
      {
    	  System.out.println(ii.next());
      } 
		 System.out.println(m.entrySet()); // to get the set view
//	     
//      hash.clear();  // clear all details of the hashmap
//       System.out.println(hash);
	}

	
	}



