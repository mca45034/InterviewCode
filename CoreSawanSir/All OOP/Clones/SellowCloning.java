package Clones;
class Banke implements Cloneable{
	int id;String name;
	public Banke(int id,String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
}

public class SellowCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		Banke b=new Banke(101, "boi");
		Banke b1=(Banke) b.clone();
		b1.id=222;
		b1.name="sbi";
		
		
		System.out.println(b.id);
		System.out.println(b.name);
		System.out.println(b1.id);
		System.out.println(b1.name);

	}

}
