package Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetAllMethods {
	public static void main(String[] args) {
		Set s = new HashSet();
		s.add("Rupali");
		s.add("patel");
		s.add("patel");
		s.add(17);
		s.add(null);s.add(null);s.add(null);
		System.out.println(s);
		System.out.println("==========================================");
		
		
		Set s1 = new TreeSet();
		// s1.add(19);
		s1.add("Ram");
		s1.add("rerma");
		s1.add("verma");
		s.add(null);
		s.add(null);
	    
		System.out.println(s1);
		System.out.println("======================================");
		Set s2 = new LinkedHashSet();
		s2.add("shayam");
		s2.add("kk");
		s2.add("kk");
		s2.add(99);
		s2.add(null);s2.add(null);s2.add(null);
		System.out.println(s2.toArray());

//		System.out.println(s2.getClass());

		System.out.println(s2);
		System.out.println("========================================");
		SortedSet s3 = new TreeSet();
		s3.add(18);
		s3.add(15);

		//s3.add(null);
		//s3.add("abc");

		System.out.println(s3);
	}

}
