package com.rays.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class higestSal {

	public static void main(String[] args) {
		
		List l= new ArrayList();
		
		l.add(1000);
		l.add(1000);
		l.add(156000);
		l.add(2000);
		
		l.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().ifPresent( e -> System.out.println(e));
	}

}
