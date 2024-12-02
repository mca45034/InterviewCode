package Sets;

import java.util.HashSet;
import java.util.Set;

public class SetInteface {
	public static void main(String[] args) {
		Set s=new HashSet();
		s.add(3);
		s.add(6);
		s.add(8);
		s.add(3);
		s.add(2);
		System.out.println(s);
		//System.out.println(s.addAll(s));
		//System.out.println(s.contains(66));
		//System.out.println(s.hashCode());
		//System.out.println(s.retainAll(s));
		//System.out.println(s.remove(8));
		System.out.println(s.size());
	}

}
