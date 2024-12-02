package Allla;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapIterator {
	public static void main(String[] args) {
		Map m=new HashMap();
		m.put(1, "tttt");
		m.put(2, "bbbbb");
		m.put(3, "vvvv");
		m.put(4, "mmmm");
		
		for(Object o :m.entrySet()) {
			Map.Entry map=(Map.Entry) o;
			System.out.println(o);
			System.out.println(map.getKey());
			System.out.println(map.getValue());
			System.out.println(map.getClass());
		}
//		for(Object o: m.values()) {
//			System.out.println(o);
//		}
//		for(Object o:m.keySet()) {
//			System.out.println(o);
//		}

		

		
	}

}
