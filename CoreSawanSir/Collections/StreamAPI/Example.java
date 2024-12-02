package StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;

class Empww{
	int id;
	String name;
	int salary;
	public Empww(int id, String name, int salary) {
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

public class Example {
	public static void main(String[] args) {
		ArrayList<Empww>al=new ArrayList<Empww>();
		al.add(new Empww(101, "sham", 3000));
		al.add(new Empww(109, "zam", 1000));
		al.add(new Empww(104, "ham", 500));
		al.add(new Empww(102, "ram", 50));
		al.stream().sorted(Comparator.comparing(Empww::getId)).
		forEach(e->System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary()));
		System.out.println("==================");
		al.stream().sorted(Comparator.comparing(Empww::getName)).
		forEach(e->System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary()));
		System.out.println("==================");
		al.stream().sorted(Comparator.comparing(Empww::getSalary)).
		forEach(e->System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary()));
		System.out.println("=====================");
		al.stream().distinct().filter(e-> (e.getSalary()>300 && e.getSalary()<3000))
		.forEach(e->System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary()));

		
	}

}
