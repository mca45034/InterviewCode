package Basics;
class Student extends Thread{
	int id;
	String name;
	public Student(int id,String name) {
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

public class StartMethod {
	public static void main(String[] args) {
		Student s=new Student(121, "rahul");
		Student s1=new Student(001, "bbbbb");
		s.start();
		s1.start();
		
		
	}

}
