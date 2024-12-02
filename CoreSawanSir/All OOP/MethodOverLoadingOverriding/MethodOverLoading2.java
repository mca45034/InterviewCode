package MethodOverLoadingOverriding;
class Methods{
	
	public void disp() {
		
		this.disp(10,10,10);
		System.out.println("i am default method....");
	}
	public void disp(int a,int b) {
		//this.disp(10,10,10);
		System.out.println("i am two perameter method.."+(a+b));
	}
	public void disp(int a,int b,int c) {
		this.disp(5,5);
		System.out.println("i am three perameter.."+(a+b+c));
	}
	
}

public class MethodOverLoading2 {
	

	public static void main(String[] args) {
		Methods m=new Methods();
		m.disp();

	}

}
