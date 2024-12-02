package StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Stud{
	int id;
	String name;
	int salary;
	public Stud(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}

public class SecondMaxSalary {
	public static void main(String[] args) {
		List<Stud>al=new ArrayList();
		al.add(new Stud(101, "sham", 1200));
		al.add(new Stud(101, "sham", 1300));
		al.add(new Stud(101, "sham", 1600));
		al.stream().distinct().filter(e-> (e.getSalary() >1200 && e.getSalary()<1600)).
		forEach(e-> System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary()));
		
	}

}
