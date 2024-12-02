package Abstacts;
class Parson{
	String name;
	String lname;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		
		return lname+age+name;
	}
}

public class ToStringm extends Parson{
	public static void main(String[] args) {
		Parson p=new Parson();
		p.setAge(12);
		p.setLname("eee");
		p.setName("rrr");
		System.out.println(p);
		
	}

}
