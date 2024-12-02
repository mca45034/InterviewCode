package MethodOverLoadingOverriding;
class Animal {
	public void sound() {
		System.out.println("i am animal....");
	}
}
class Dog extends Animal{
	public void sound() {
		super.sound();
		System.out.println("i am Dog......");
	}
}
class Cat extends Dog{
	public void sound() {
		super.sound();
		System.out.println("i am cat....");
	}
}
public class MethodOverridingMain {
	public static void main(String[] args) {
		
	Animal[] a=new Animal[2];
	
	a[0]=new Dog();
	a[1]=new Cat();
	a[0].sound();
	System.out.println("=========================");
	a[1].sound();
	}
}
