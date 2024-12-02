package Imp;

public class IsAliveMethod extends Thread{
	@Override
	public void run() {
		System.out.println("i am alive method..!!!!!!");
	}
	public static void main(String[] args) {
		IsAliveMethod i=new IsAliveMethod();
		IsAliveMethod t=new IsAliveMethod();
//		System.out.println(t.isAlive());
//		System.out.println(i.isAlive());
		i.start();
		//System.out.println(i.isAlive());
		//System.out.println(t.isAlive());
		//System.out.println(t.isAlive());
		t.start();
		System.out.println(i.isAlive());
		System.out.println(t.isAlive());
	}
	

}
