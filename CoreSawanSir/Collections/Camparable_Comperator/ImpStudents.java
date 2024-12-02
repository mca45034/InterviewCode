package Camparable_Comperator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Student implements Comparable<Student>{
	int id;
	String name;
	int  marks;
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Student o) {
		if (this.name.equals(o.name)) {

			return o.id - this.id;

		} else {

			return this.name.compareTo(o.name); 

		}
	
}
}

public class ImpStudents {
	public static void main(String[] args) {
		Student s=new Student(101, "sham", 50);
		Student s1=new Student(101, "asham", 60);
		Student s2=new Student(116, "ram", 50);
		Student s3=new Student(100, "ram", 60);
		List l=new ArrayList();
		
		l.add(s);
		l.add(s1);
		l.add(s2);
		l.add(s3);
		Collections.sort(l);
		Iterator<Student>it=l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
