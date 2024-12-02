package Basics;
class Inthread extends Thread{
	String name;
	public Inthread(String name) {
		
		this.name=name;
	}
	@Override
	public void run() {
		for (int i = 0; i <4; i++) {
			System.out.println(i+""+name);
			
		}
	}
	
}

public class UseThread {
	public static void main(String[] args) {
		Inthread  i=new Inthread("rahul");
		Inthread i1=new Inthread( "nitish");
		i.run();
		i1.run();
	}

}
