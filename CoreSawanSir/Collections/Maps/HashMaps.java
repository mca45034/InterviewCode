package Maps;

import java.util.HashMap;

public class HashMaps {
	public static void main(String[] args) {
		HashMap<Integer, String>hm=new HashMap<Integer, String>();
		hm.put(1, "ram");
		hm.put(4, "ram");
		hm.put(2, "ram");
		hm.put(3, "bam");
		hm.put(null, null);
		hm.put(null, null);
		hm.put(7, null);
		System.out.println(hm);
		
	}

}
