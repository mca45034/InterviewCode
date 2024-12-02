package Basics;
class abc extends Thread{
	String name;
	public abc(String name) {
		this.name=name;
	}
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
		
	}
}

public class Examples {
	public static void main(String[] args) {
		abc a=new abc("rahul");
		abc a1=new abc("dev");
	//	a.setDaemon(true);
		a.start();
		try {
			//Thread.sleep(600);
			a.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		a1.start();
		
	}

}
