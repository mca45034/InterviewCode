package ExplicitlyAndImplicitly;
class emp{
	public emp() {
		System.out.println("i am implicitliy constructor.....");
	}
}

public class ImplelicitlyMain extends emp{
	
	public ImplelicitlyMain(int a,int b,int c) {
		
		// TODO Auto-generated constructor stub
		//System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		ImplelicitlyMain i=new ImplelicitlyMain(2,3,4);

	}

}
