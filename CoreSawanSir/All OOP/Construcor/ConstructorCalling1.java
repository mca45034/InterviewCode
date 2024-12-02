package Construcor;

class Parson{
	String fname,lname;int age;
	
	public Parson(String fname,String lname) {
		this.fname=fname;
		this.lname=lname;
		System.out.println(fname);
		System.out.println(lname);
	}
	public Parson(String fname,String lname,int age) {
		this(fname,lname);
		this.age=age;
		System.out.println(age);
	}
}

public class ConstructorCalling1 extends Parson {
	public ConstructorCalling1(String fname,String lname,int age) {
		super(fname,lname,age);
	}
	public static void main(String[] args) {
		ConstructorCalling1 c=new ConstructorCalling1("names", "java", 12);
		
	}

}
