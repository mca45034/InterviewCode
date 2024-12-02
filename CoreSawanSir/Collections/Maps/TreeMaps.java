package Maps;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMaps {
	public static void main(String[] args) {
		SortedMap<Integer, String>hm=new TreeMap<Integer, String>();
		hm.put(1, "ram");
		hm.put(4, "ram");
		hm.put(2, "ram");
		hm.put(3, "bam");
		//hm.put(null, null);
		System.out.println(hm.lastKey());
		System.out.println(hm.firstKey());
		System.out.println(hm);
	}

}
