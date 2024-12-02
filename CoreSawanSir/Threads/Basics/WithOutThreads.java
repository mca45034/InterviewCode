package Basics;
class ThreadOut {
	int id;
	String name;
	public ThreadOut(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i+id+""+name);
		}
	}
	
}

public class WithOutThreads {
	public static void main(String[] args) {
		ThreadOut o=new ThreadOut(101, "rahul");
		ThreadOut o1=new ThreadOut(105, "sham");
		o.run();
		o1.run();
	}

}
