package Camparable_Comperator;

import java.util.HashMap;
import java.util.Map;

class Employee{
	int id;
	String name;
	String dep;
	public Employee(int id, String name, String dep) {
		
		this.id = id;
		this.name = name;
		this.dep = dep;
	}
	@Override
	public int hashCode() {
		System.out.println("hashcode");
		String s=this.id+this.name+this.dep;
		return s.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("equal method");
		if(obj==null) {
			return false;
		}
		if(!(obj instanceof Employee)) {
			return false;
		}
		Employee e=(Employee) obj;
		String st=this.id+this.name+this.dep;
		String st1=e.id+e.name+e.dep;
		return st.equals(st1);
	}
	@Override
	public String toString() {
		return  id  + name  + dep ;
	}
	
	
}

public class MapHashCodeEqula {
	public static void main(String[] args) {
		
	
		Employee e=new Employee(101,"sham","it");
		Employee e1=new Employee(101,"sham","it");
		Employee e2 = new Employee(10, "efesf", "fr");
	
//	 System.out.println("HashCode of e: " + e.hashCode());
//     System.out.println("HashCode of e1: " + e1.hashCode());
//     System.out.println("Are e and e1 equal? " + e1.equals(e1));
	Map map = new HashMap();
	map.put(e,1);
	map.put(e1,2);
	map.put(e2, 3);
	System.out.println(map);

//	 for (Employe employe : map.keySet()) {
//         System.out.println(employe);
//     }
	// System.out.println("Are e and e1 equal? " + map.equals(e1));

    
	}
}
