package Imp;
class Emp extends Thread{
	int id;
	String name;
	public Emp(int id,String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(id+" "+name);
		}
	}
	
}

public class DaemonThreads {
	public static void main(String[] args) {
		Emp e=new Emp(101, "rahul");
		e.setDaemon(true);
		e.start();
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e2) {
				e2.printStackTrace();
			}
			System.out.println(i);
		}
		
	}

}
