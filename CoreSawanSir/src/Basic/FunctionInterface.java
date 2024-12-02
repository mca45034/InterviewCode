package Basic;

@FunctionalInterface
public interface FunctionInterface {
	public int sum(int a,int b);
	public static void multi(int a,int b,int c) {
		System.out.println("ia m static method :"+(a*b*c));
	}
	public default void sub(int a,int b) {
		System.out.println("i am default method :"+(a-b));
	}
	
}
