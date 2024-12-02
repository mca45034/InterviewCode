package Clones;

class Dep implements Cloneable {
	String deps;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class Empa implements Cloneable {
	String name;
	Dep s=new Dep();
	public Empa(String name,String deps) {
		this.name=name;
		this.s.deps=deps;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		Empa e= (Empa) super.clone();
		e.s=(Dep) s.clone();
		return e;
	}
}

public class DeepEmploye {
	public static void main(String[] args) throws CloneNotSupportedException {
		Empa s=new Empa("rahul", "it");
		Empa s1=(Empa) s.clone();
		s1.name="sham";
		s1.s.deps="hr";
		System.out.println(s.name);
		System.out.println(s.s.deps);
		System.out.println(s1.name);
		System.out.println(s1.s.deps);
	}

}
