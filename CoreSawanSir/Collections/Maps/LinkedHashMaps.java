package Maps;

import java.util.LinkedHashMap;

public class LinkedHashMaps {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String>hm=new LinkedHashMap<Integer, String>();
		hm.put(1, "ram");
		hm.put(4, "ram");
		hm.put(2, "ram");
		hm.put(3, "bam");
		hm.put(null, null);
		hm.put(9, null);
		hm.put(7, null);
		System.out.println(hm.values());
		System.out.println(hm.containsValue("ram"));
		System.out.println(hm);
	}

}
