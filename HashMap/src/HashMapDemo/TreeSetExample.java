package HashMapDemo;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
	String Tree;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet tree = new TreeSet<>();
		tree.add("apple");
		tree.add("banana");
		tree.add("manu");
		tree.add("ammu");
		System.out.println(tree);
		//tree.clear();
		tree.comparator();
		System.out.println(tree);
		//tree.first();
		System.out.println(tree.first());
		System.out.println(tree.last());
		System.out.println(tree.headSet("banana"));
		//System.out.println(tree.higher("banana"));
		System.out.println(tree.isEmpty());
		System.out.println(tree.size());
		System.out.println(tree.floor("apple"));
		//tree.remove("apple");
		System.out.println(tree);
		System.out.println(tree.pollFirst());
		System.out.println(tree.pollLast());
		//System.out.println(tree.tailSet("manu"));
		Iterator ii= tree.iterator();
		while(ii.hasNext())
		{
			System.out.println(ii.next());
		}

	}

}
