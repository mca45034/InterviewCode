package MethodOverLoadingOverriding;
class MethodOverLoading{
	
	public  void name(int a,int b) {
		System.out.println(a*b);
	}
	public  void name(int a,int b,int c) {
		System.out.println(a*b+c);
	}
}

public class MethodOverLoadingMain {
	public static void main(String[] args) {
		MethodOverLoading m=new MethodOverLoading();
		m.name(5,10);
		m.name(2, 2, 6);
	}

}
