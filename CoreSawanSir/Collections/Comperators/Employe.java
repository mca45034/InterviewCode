package Comperators;

public class Employe {
	int id;
	String name;
	String dep;
	int salary;
	public Employe(int id, String name, String dep, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.dep = dep;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", dep=" + dep + ", salary=" + salary + "]";
	}
	

}
