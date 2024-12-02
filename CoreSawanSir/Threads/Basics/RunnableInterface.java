package Basics;
class Home implements Runnable{
	int id;
	String name;
	public Home(int id,String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	public void run() {
		for (int i = 0; i <5; i++) {
			System.out.println(id+" "+name);
		}
		
	}
}

public class RunnableInterface {
	public static void main(String[] args) {
		Thread t=new Thread(new Home(100, "dev"));
		Thread t1=new Thread(new Home(44, "ccc"));
		t1.start();
		t.start();
	}

}
