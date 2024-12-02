package Allla;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetss {
	public static void main(String[] args) {
		TreeSet<Integer>s=new TreeSet<Integer>(); 
		s.add(2);
		s.add(1);
		s.add(9);
		s.add(5);
		//lsthaf
//		System.out.println(s);
//		System.out.println(s.last());
//		System.out.println(s.size());
		System.out.println(s.tailSet(5));
		System.out.println(s.headSet(15));
//	System.out.println(s.first());
		
		
	}

}
