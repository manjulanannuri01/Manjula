package HashMapDemo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class Hashset {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Set hash=new HashSet<>();
       System.out.println("before adding "+hash);
       hash.add("manju");  //storing the value from hashtable
       hash.add("ammu");
       hash.add("bujji");
       hash.add(102);
       hash.addAll(hash);
       System.out.println("after adding "+hash);
       System.out.println(hash.size()); // it returns the size of the hash table
       System.out.println(hash.remove(102)); // remove the single elements
       System.out.println(hash.removeAll(hash)); // remove all elements
       System.out.println(hash);
       System.out.println(hash.contains("manju")); // it returns the boolean type like string present or not
       System.out.println(hash.contains("manu"));
       System.out.println(hash.isEmpty()); //it check set is empty or not
         HashSet set=new HashSet();
         set.add("manju");
         set.add("ammu");
         set.add(104);
         hash.addAll(set);
       System.out.println(set);
      hash.retainAll(set); // conly common vallues will be return
      System.out.println(hash);
       System.out.println(hash.toString());// display the set
       System.out.println(hash.equals(set)); // check the two index equal or not
       Iterator ii= hash.iterator();  // return an iterator of the same elements as the set
       for(;ii.hasNext();)
       {
    	   System.out.println(ii.next());
       }
       
		
	}

}
