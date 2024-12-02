package Interface;
interface Sums{
	public static String name="Rahul Kirar";
	
	public int sum(int a,int b);
}

public class Sum implements Sums{
	@Override
	public int sum(int a, int b) {
 
		return a+b;
		
	}
	public static void main(String[] args) {
		Sum s=new Sum();
		System.out.println(s.sum(12,14));
		System.out.println(name);
	}

}
