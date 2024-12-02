package Allla;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Employe{
	int id;
	String name;
	String dep;
	public Employe(int id, String name, String dep) {
		
		this.id = id;
		this.name = name;
		this.dep = dep;
	}
	@Override
	public int hashCode() {
		String s=this.id+this.name+this.dep;
		return s.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Employe e=(Employe) obj;
		String st=this.id+this.name+this.dep;
		String st1=e.id+e.name+e.dep;
		if(obj==null) {
			return false;
		}
		if(!(obj instanceof Employe)) {
			return false;
		}
		return st.equals(st1);
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", dep=" + dep + "]";
	}
	
	
}

public class HashCodeEmploye {
	public static void main(String[] args) {
//		Employe e=new Employe(101, "sham", "it");
//		Employe e1=new Employe(101, "sham", "it");
//		Collection   l=new ArrayList<Employe>();
//		l.add(e);
//		l.add(e1);
//		Iterator<Employe>it=l.iterator();
//		while(it.hasNext()) {
//			Employe es=it.next();
//			System.out.println(es);
//		}
//		System.out.println(e.hashCode());
//		System.out.println(e1.hashCode());System.out.println(e.equals(e1));
		
		Employe e1 = new Employe(1, "kapil", "it");
		Employe e2 = new Employe(1, "kapil", "it");
		Employe e4 = new Employe(10, "kapil", "it");

		Map m=new HashMap();
		m.put( e1,1);
		m.put( e2,2);
		
		m.put( e4,4);
		System.out.println(m);
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());System.out.println(e1.equals(e2));
//		
//	HashSet s=new HashSet();
//		s.add(e1);
//		s.add(e2);
//		s.add(e4);
//		System.out.println(s);
//		System.out.println(e1.hashCode());
//		System.out.println(e2.hashCode());System.out.println(e1.equals(e4));
		
		
		
	}

}
