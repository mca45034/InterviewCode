package ExceptionCustoms;
class SExcaption extends Exception{
	public SExcaption() {
		super("i am cheked exception....");
	}
}

public class cheakedException {
	public static void main(String[] args) throws SExcaption {
		Grend();
	}
	public static void Grend() throws SExcaption {
		try {
			Parent();
		} catch (SExcaption e) {
			System.out.println(e.getMessage());
		}
	}
	public static void Parent() throws SExcaption {
		child();
	}
	
	public static void child() throws SExcaption {
		SExcaption s=new SExcaption();
		throw s;
	}

}
