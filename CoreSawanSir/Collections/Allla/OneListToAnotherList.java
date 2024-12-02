package Allla;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class OneListToAnotherList {
	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<String>();
		List<String>l=new ArrayList<String>();
		al.add("dddd");
		al.add("cccc");
		al.add("bbb");
		Iterator<String>it=al.iterator();
		while(it.hasNext()) {
			String s=it.next();
			System.out.println(s);
			l.add(s);
		}
		System.out.println(l);
	}

}
