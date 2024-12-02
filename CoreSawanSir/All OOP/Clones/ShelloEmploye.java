package Clones;

class Emp implements Cloneable{
	String name;String dep;
	public Emp(String name,String dep) {
		this.name=name;this.dep=dep;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
public class ShelloEmploye {

	public static void main(String[] args)throws CloneNotSupportedException {
		Emp e=new Emp("Rahul", "IT");
		Emp e1=(Emp) e.clone();
		e1.dep="HR";
		e1.name="Sham";
		System.out.println(e.name);
		System.out.println(e.dep);
		System.out.println(e1.dep);
		System.out.println(e1.name);
		
	}

}
