package ShapesAll;

class Shap{
	public double area() {
		return 0;
	}
}
class Circle extends Shap{
	public final double PI=3.14;
	double radius;
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double area() {
		return PI*radius*radius;
	}
	
}
class Rectanle extends Shap{
	double width;
	double length;
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double area() {
		return width*length;
	}
	
}

public class Shap1setget {
	public static double Area(Shap[] s) {
		double total=  0;
		for (int i = 0; i < s.length; i++) {
			total=total+s[i].area();
		}
		return total;
	}
	public static void main(String[] args) {
		
	
	Shap[] s=new Shap[2];
	s[0]=new Circle();
	s[1]=new Rectanle();
	Circle c=(Circle) s[0];
	c.setRadius(2);
	System.out.println(c.area());
	
	Rectanle r=(Rectanle) s[1];
	r.setLength(2);
	r.setWidth(4);
	System.out.println(r.area());
	
	double a=Area(s);
	System.out.println(a);

}
	
}
