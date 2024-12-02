package Allla;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListInterface {
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(2);
		l.add(3);
		l.add(5);
		l.add(9);
		System.out.println(l.add(88));
		System.out.println(l);
		System.out.println(l.get(0));
		System.out.println(l.remove(4));
		System.out.println(l.size());
		//l.add(l.set(1, 44));
		System.out.println(l);
	System.out.println(l.subList(0, 2));
		System.out.println(l.lastIndexOf(9));
		
//		Map m=new HashMap();
//		m.put(1, "rahul");
//		m.put(2, "kirar");
//		for(Object o:m.entrySet()) {
//			System.out.println(o);
//			Map.Entry p=(Map.Entry)o;
//			System.out.println(p.getKey());
//			System.out.println(p.getValue());
//		}
	}

}
