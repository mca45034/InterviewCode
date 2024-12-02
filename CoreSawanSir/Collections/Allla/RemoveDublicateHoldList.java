package Allla;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDublicateHoldList {
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(2);
		l.add(3);
		l.add(3);
		l.add(5);
		l.add(5);
		l.add(8);
		
		Set unique=new HashSet(l);
		
		
		
		Set dublicate=new HashSet();
		for(Object o:l) {
			if(!unique.add(o)) {
				dublicate.add(o);
			}
		}
		//System.out.println("unique elements ..."+unique);
		System.out.println(l);
		List ls1=new ArrayList(dublicate);
		System.out.println("dublicate ..."+ls1);
		List ls=new ArrayList(unique);
		System.out.println("unique elements ..."+ls);
		
	}

}
