package Allla;

public class AutoAndUnBoxing {
	public static void main(String[] args) {
		int a=2;
		Integer b=a;//autoboxing
		System.out.println(b);
		
		Integer i=new Integer(8);
		int c=i; //Unboxing
		System.out.println(c);
	}

}
