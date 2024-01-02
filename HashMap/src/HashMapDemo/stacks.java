package HashMapDemo;

import java.util.Stack;

public class stacks {

	public static void main(String[] args) {
		// stack LIFO
		Stack s= new Stack();
		System.out.println("before adding elements"+s);
		s.push("apple");  //adding elements to the stack
		s.push("banana");
		s.push("watermelon");
		s.push("pineapple");
		System.out.println("afater adding elements"+s);
		System.out.println(s.pop());//remove the top of the elements
		System.out.println(s.peek());// display the top of the elements
		System.out.println(s.search("banana"));// index number
	    System.out.println(s.empty());
	    System.out.println(s.size());
	    System.out.println(s.contains("manu"));
	
	}

}
