package Maps;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMaps {
	public static void main(String[] args) {
		SortedMap<Integer, String>hm=new TreeMap<Integer, String>(); 
		hm.put(1, "ram");
		hm.put(4, "ram");
		hm.put(2, "ram");
		hm.put(3, "bam");
	//	hm.put(null, null);
//		hm.put(null, null);
//		hm.put(7, null);
		System.out.println(hm.subMap(2, 4));
		System.out.println(hm.entrySet());
	}

}
