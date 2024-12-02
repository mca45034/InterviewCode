package Allla;

import java.util.ArrayList;
import java.util.List;

public class PrintMiddleValueList {
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(3);
		l.add(6);
		l.add(1);
		l.add(8);
		l.add(5);
		System.out.println(l.get((l.size()-1)/2));
	}

}
