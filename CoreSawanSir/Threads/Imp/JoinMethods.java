package Imp;
class Student extends Thread{
	int id;
	String name;
	public Student(int id,String name) {
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

public class JoinMethods {
	public static void main(String[] args) {
		Student s=new Student(101, "rahul");
		Student s1=new Student(202, "kirar");
		s.run();
		try {
			s.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		s1.run();
	}

}
