package Construcor;

public class ConstructorOverLoading {
	public ConstructorOverLoading() {
		this(10,10);
		System.out.println("default ");
	}
	public ConstructorOverLoading(int a,int b) {
		this(15,15,15);
		System.out.println(a+b);
	}
	public ConstructorOverLoading(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		ConstructorOverLoading c=new ConstructorOverLoading();
		
		
	}
	

}
