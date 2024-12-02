package Interface;

interface Name{
	public final static String names="Rahul Kirar";
	public  void Employe(String fName,String lName,int age);
}
public class Constructors implements Name{
	String school;
	int fee;
	public Constructors(String school,int fee) {
		this.school=school;
		this.fee=fee;
		
	}
	public void disp() {
		System.out.println(school);
		System.out.println(fee);
		System.out.println(names);
	}
	@Override
	public void Employe(String fName, String lName, int age) {
		System.out.println(fName);
		System.out.println(lName);
		System.out.println(age);
		
	}

	public static void main(String[] args) {
		Constructors c=new Constructors("ncs", 2300);
		c.Employe("rahul", "kirar", 24);
		c.disp();
		
		

	}

	

}
