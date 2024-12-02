package Allla;

import java.util.Enumeration;
import java.util.Vector;

public class Enumerations {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(1);
		v.add(4);
		v.add(6);
		v.add(7);
		v.add(null);
		v.add(null);
		v.add(null);
		v.add(null);
		Enumeration e=v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
