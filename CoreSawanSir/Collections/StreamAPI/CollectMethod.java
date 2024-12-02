package StreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Stud1{
	int phone;
	String name;
	public Stud1(int phone, String name) {
		super();
		this.phone = phone;
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class CollectMethod {
	public static void main(String[] args) {
		
		List<Stud1>al=new ArrayList<Stud1>();
		al.add(new Stud1(464564646, "sham"));
		al.add(new Stud1(676567547, "ram"));
		al.add(new Stud1(98978787, "dev"));
		al.add(new Stud1(88564646, "pam"));
		al.stream().map(c -> c.getPhone() + " " + c.getName()).distinct()

		.collect(Collectors.collectingAndThen(Collectors.toList(), c -> { Collections.shuffle(c); return c.stream(); 
		})).limit(3).forEach(c -> System.out.println(c));
	}

}
