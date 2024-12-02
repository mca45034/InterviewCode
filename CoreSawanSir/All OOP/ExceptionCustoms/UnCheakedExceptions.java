package ExceptionCustoms;
class uncheked extends RuntimeException{
	public uncheked(String msg) {
		super(msg);
	}
}

public class UnCheakedExceptions {
	public static void main(String[] args) throws Exception {
		greandFather();
	}
	public static void greandFather() {
		try {
			father();
		} catch (uncheked e) {
			System.out.println(e);
		}
	}
	public static void father()  {
		child();
	}
	public static void child() {
		
			uncheked u=new uncheked("uncheaked exception.....");
			throw u;
		
	}
	
	

}
