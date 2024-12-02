package Basic;

public class FunctionalInterfaceLambdaMain {
	public static void main(String[] args) {
		FunctionInterface f=(a,b)->{
			return a+b;
		};
		int a=5;
		int b=10;
		int c=15;
		System.out.println(f.sum(a, b));
		f.sub(a, b);
		FunctionInterface.multi(a, b, c);
	}

}
