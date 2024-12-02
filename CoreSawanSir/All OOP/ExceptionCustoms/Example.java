package ExceptionCustoms;
class ex extends Exception{
	public ex(String msg) {
		super(msg);
	}
}

public class Example {
	public static void main(String[] args) {
		gfather();
	}
	public static void gfather() {
		try {
			father();
		} catch (ex e) {
			System.out.println(e.getMessage());
		}
	}
	public static void father() throws ex {
		child();
	}
	public static void child() throws ex {
		ex e=new ex("cheaked exceptions.....");
		throw e;
	}
}
