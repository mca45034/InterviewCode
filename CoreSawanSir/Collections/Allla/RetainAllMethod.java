package Allla;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RetainAllMethod {
	public static void main(String[] args) {
		List c=new ArrayList();
		c.add(1);
		c.add(3);
		c.add('e');
		c.add('y');
		System.out.println(c);
		Collection c1=new ArrayList();
		c1.add(7);
		c1.add(9);
		c1.add('e');
		c1.add('y');
		c1.add('t');
		System.out.println(c1);
		c.retainAll(c1);
		System.out.println(c);
	}

}
