package Allla;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestRevarsArry {
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(1);
		l.add(5);
		l.add(7);
		l.add(4);
		Collections.sort(l);
		System.out.println(l);
		Collections.reverse(l);
		System.out.println(l);
		
		
	}

}
