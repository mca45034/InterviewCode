package ShapesAll;


class Shaps{
	public double area() {
		return 0;
	}
	public static Shaps getShap(String  i) {
		if(i.equals("r")) {
			return new Circles(3);
		}if(i.equals("k")) {
			return new Ractanles(2, 4);
		}
		return new Shaps();
		
	}
}
class Circles extends Shaps{
	public final double PI=3.14;
	public double radius;
	public Circles( double radius) {
		this.radius=radius;
	}
	
	
	public double area() {
		return PI*radius*radius;
	}
	
}
class Ractanles extends Shaps{
	int langth;
	int width;
	public Ractanles(int langth,int width) {
		this.langth=langth;
		this.width=width;
	}
	public double area() {
		return langth*width;
	}
}

public class Example {
	
	public static void main(String[] args) {
		Shaps s=Shaps.getShap("r");
		System.out.println(s.area());
		Shaps s1=Shaps.getShap("k");
		System.out.println(s1.area());
		System.out.println(s.area()+s1.area());
		
	}

}
