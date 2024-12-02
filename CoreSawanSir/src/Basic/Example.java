package Basic;



class Shap1{
	
	public double area() {
		return 0;
	}
	
}
class Circle1 extends Shap1{
	double radius;
	public final double PI=3.14;
	public Circle1(double radius) {
		this.radius=radius;
	}
	public double area() {
		return PI*radius;
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

public class Example {
	public static void main(String[] args) {
			Shap1[] s=new Shap1[2];
			s[0]=new Circle1(2);
			s[1]=new Rectanle1(2, 2);
			Circle1 c=(Circle1) s[0];
			System.out.println(c.area());
			Rectanle1 r=(Rectanle1) s[1];
			System.out.println(r.area());
			
//		for (int i = 0; i < s.length; i++) {
//			System.out.println(s[i].area());
//		}
	}
}

