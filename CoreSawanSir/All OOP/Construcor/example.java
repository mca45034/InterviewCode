package Construcor;
class emp{
	public emp(int a,int b) {
		System.out.println("default constructors....."+(a+b));
	}
}
public  class example extends emp {
	public example(int a,int b) {
		super(a,b);
		
	}
	public static void main(String[] args) {
		example e=new example(3,4);
		
	}
	
}