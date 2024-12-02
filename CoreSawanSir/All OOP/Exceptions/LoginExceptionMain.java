package Exceptions;
class LoginException extends Exception{
	public LoginException(String msg) {
		super(msg);
	}
}

public class LoginExceptionMain {
	public static void main(String[] args) {
		String s="rahul@1e23";
		try {
			if(s.equals("rahul@123")) {
				System.out.println("valid id");
			}else {
				throw new LoginException("invalid id");
			}
		} catch (LoginException e) {
			System.out.println(e);
		}
	}

}
