package Abstacts;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


class Parsone{
	public final static String NAME="SISCO";
	String name;
	String age;
	Date dates;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Date getDates() {
		return dates;
	}
	public void setDates(Date dates) {
		this.dates = dates;
	}
	
	
	
}

public class ParsoneTest extends Parsone {
	public static void main(String[] args) throws ParseException {
		Parsone p=new Parsone();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
		p.setName("rahul");
		p.setAge("45");
		p.setDates(sdf.parse("12-12-2003"));
		System.out.println(p.getName());
		System.out.println(p.getDates());
		System.out.println(p.getAge());
		
	}

}
