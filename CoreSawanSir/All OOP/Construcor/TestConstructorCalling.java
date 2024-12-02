package Construcor;
class ConstructorCalling {

	String fName;
	String lName;
	String Address;
	public ConstructorCalling() {
		// TODO Auto-generated constructor stub
	}

	public ConstructorCalling(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
		System.out.println(fName);
		System.out.println(lName);
	}

	public ConstructorCalling(String fName, String lName, String Address) {
		this(fName, lName);
		
		this.Address = Address;
		System.out.println(Address);
	}
}
public class TestConstructorCalling extends ConstructorCalling {

	public TestConstructorCalling(String fName, String lName, String Address) {
		super(fName, lName, Address);
	}

	public static void main(String[] args) {
		TestConstructorCalling t = new TestConstructorCalling("rahul", "kirar", "indore");
	}

}
