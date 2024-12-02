package Abstacts;
abstract class Animal{
	public abstract void sound();
	public void disp() {
		System.out.println("i am animal.....");
	}
}
class Cat extends Animal{

	@Override
	public void sound() {
		super.disp();
		System.out.println("i am cat.....");
		
	}
	
}
class Dog extends Animal{

	@Override
	public void sound() {
		super.disp();
 System.out.println("i am dog........");		
	}
	
}

public class AllAnimal {
	public static void main(String[] args) {
		Animal [] a=new Animal[2];
		a[0]=new Cat();
		a[1]=new Dog();
		for (int i = 0; i < a.length; i++) {
			a[i].sound();
		}
//		a[0].sound();
//		a[1].sound();
	}

}
