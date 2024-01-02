package HashMapDemo;

import java.util.LinkedList;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		System.out.println("before adding elements"+list);
		list.add("manju");
		list.add("ammu");
		list.add("bindu");
		list.add(2, "Reddy");
		list.addFirst("manu");
		list.addLast("kanna");
		System.out.println("After adding elements"+list);
	  list.clear();
	  System.out.println(list);
		System.out.println(list.contains("sweety"));
		System.out.println(list.element());// it returns the first elements
	    System.out.println(list.get(2)); 
	    System.out.println(list.getFirst());
	    System.out.println(list.getLast());
		System.out.println(list.peek()); // first element and it can be removed
		System.out.println(list.pop());// top of the element
		System.out.println(list.poll());//top ofthe element display and it can be removed
		System.out.println(list.remove());
		System.out.println(list.size());
		list.push("sisi");
		System.out.println(list);//Pushes an element onto the stack represented by this list

	}

}
