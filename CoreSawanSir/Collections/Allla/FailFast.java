package Allla;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFast {
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(3);
		l.add(7);
		l.add("rahul");
		l.add('r');
		Iterator it=l.iterator();
		l.add(88);
		l.remove(3);
//		l.add(99);
//		l.add("rahul");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
