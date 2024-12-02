package Allla;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethod {
	public static void main(String[] args) {
		Collection c = new ArrayList();

		c.add(10);
		c.add(20);
		c.add(30);
		c.add(40);
		System.out.println(c.add(50));
		System.out.println(c);
		System.out.println(c.addAll(c));
		System.out.println(c);
		
		System.out.println(c.contains(34));
		System.out.println(c.containsAll(c));
		
     	System.out.println(c.isEmpty());
		System.out.println(c.iterator());
		System.out.println(c.remove(44));
		
		System.out.println(c.removeAll(c));
		
       
		
	} 

}
