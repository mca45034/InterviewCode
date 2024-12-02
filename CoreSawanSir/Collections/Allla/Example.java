package Allla;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class Example {
	
public static void main(String[] args) {

	Collection<Integer> l = new ArrayList<>();
	
	l.add(4);
	l.add(5);
	l.add(6);
	l.add(7);

	Collections.synchronizedCollection(l);
	System.out.println(l);
	}
}


