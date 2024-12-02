package Imp;
class Employe extends Thread{
	int id;
	String name;
	public Employe(int id,String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	public void run() {
		for (int i = 0; i <=5; i++) {
			System.out.println(id+" "+name);
		}
	}
}

public class PriorityThread {
	public static void main(String[] args) {
		Employe e=new Employe(101, "rahul");
		Employe e1=new Employe(200, "sham");
		e.setPriority(10);
		e1.setPriority(1);
		e.start();
		e1.start();
	}

}
