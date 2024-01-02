package HashMapDemo;
import java.util.ArrayList;
import java.util.Iterator;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList array=new ArrayList();
     System.out.println("before adding elements"+array);
     array.add("manju");
     array.add("ammu");  //inserts the elements in list
     array.add("reddy");
     array.add("ammu");
     array.add("null");
     array.add(0,"bindu");//Inserts the specified element at the specified position in this list.
     System.out.println("after adding elements"+array);
//     array.clear();
//     System.out.println("after adding elements"+array);
//     array.contains("null");//contains methods check the elements present or not in the list
//     System.out.println("after adding elements"+array);
//     System.out.println(array.get(2));// getting the elements in particular index
//     System.out.println(array.isEmpty());
//     System.out.println(array.lastIndexOf("null"));//it returns the which index it stored in list
//     System.out.println(array.remove(5));// remove the elements
//   //System.out.println(array.removeAll(array));
//     System.out.println(array);
//     System.out.println(array.size());// size of the index
//     array.trimToSize();// number of elements
//     System.out.println(array);
     //fetching purpose
     Iterator ii= array.iterator();//iterator using sequence order
     for(;ii.hasNext();)
     {
    	
    	 System.out.println(ii.next());
    	 ii.remove();
     }
      System.out.println(ii);
      System.out.println(array.isEmpty());
	}
	
}
