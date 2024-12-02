package Camparable_Comperator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Employe implements Comparable<Employe>{
	int id;
	String name;
	String dep;
	public Employe(int id, String name, String dep) {
		super();
		this.id = id;
		this.name = name;
		this.dep = dep;
	}
	
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", dep=" + dep + "]";
	}

	@Override
	public int compareTo(Employe o) {
		if(this.id<o.id)
			return 1;
		else if(this.id>o.id)
			return -1;
		return 0;
	}
	
}

public class EmployeComparable {
	public static void main(String[] args) {
		Employe e=new Employe(106, "rahul", "it");
		Employe e1=new Employe(102, "rahul", "it");
		Employe e2=new Employe(104, "kahul", "it");
		Employe e3=new Employe(108, "kahul", "it");
		List l=new ArrayList();
		l.add(e);
		l.add(e3);
		l.add(e1);
		l.add(e2);
		Collections.sort(l);
		Iterator<Employe>it=l.iterator();
		while(it.hasNext()) {
			Employe e7=it.next();
			if(e7.dep.equals("it"))
			System.out.println(e7);
		}
		
		
	}

}
