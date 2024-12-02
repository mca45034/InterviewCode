package Clones;
class State implements Cloneable{
	String state;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
class City implements Cloneable{
	String city;
	State s=new State();
	public City(String city,String state) {
		this.city=city;
		this.s.state=state;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		City c=(City) super.clone();
		c.s=(State) s.clone();
		return c;
	}
}
public class DeepTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		City c=new City("indore", "MP");
		City c1=(City) c.clone();
		c1.city="patan";
		c1.s.state="rajasthan";
		System.out.println(c.city);
		System.out.println(c.s.state);
		System.out.println(c1.city);
		System.out.println(c1.s.state);
	}

}
