package ShapesAll;
class Shap1{
	
	public double area() {
		return 0;
	}
	public static Shap1 getShap(int i) {
		if(i==1) {
			return new Circle1(2.0);
		}if(i==2) {
			return new Rectanle1(2, 3);
		}
		return new Shap1();
	}
}
class Circle1 extends Shap1{
	double radius;
	public final double PI=3.14;
	public Circle1(double radius) {
		this.radius=radius;
	}
	public double area() {
		return PI*radius*radius;
	}
}
class Rectanle1 extends Shap1{
	double length;
	double width;
	public Rectanle1(double length, double width) {
		this.length = length;
		this.width = width;
	}
	public double area() {
		return length*width;
	}
	
}

public class ShapMethodCall {

	public static void main(String[] args) {
		Shap1 s=Shap1.getShap(1);
		Shap1 s1=Shap1.getShap(2);
		System.out.println(s.area());
		System.out.println(s1.area());
		System.out.println(s.area()+s1.area());
		
	}

}
