package ExplicitlyAndImplicitly;

class Exp {
	
	public Exp() {
		System.out.println("ugjuhbiuoy");
	}

	public Exp(int a, int b) {
		System.out.println("i am explicitliy...:" + (a + b));
	}

}

public class ExplicitlyMain extends Exp {

	public ExplicitlyMain(int a, int b) {
		// super(a, b);
	}
	
	public ExplicitlyMain(String a, int b) {
		// super(a, b);
	}

	public static void main(String[] args) {
		ExplicitlyMain e = new ExplicitlyMain(3, 5);
	}

}
