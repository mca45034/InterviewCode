package StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Emp {
	int id;
	String name;
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}


 public class EmployeTest{
	 public static void main(String[] args) {
		List<Emp>al=new ArrayList();
		al.add(new Emp(101, "sham"));
		al.add(new Emp(103, "aham"));
		al.add(new Emp(102, "xam"));
		al.stream().sorted(Comparator.comparing(Emp::getId)).forEach(e->System.out.println(e.getId()+" "+e.getName()));
			
		}
	}
	 
 

