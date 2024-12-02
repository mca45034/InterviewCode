package Comperators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
class CustomeException extends Exception{
	public CustomeException(String msg) {
		super(msg);
	}
}

public class StudentMain {
	public static Comparator<Student> SortName=new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return o2.getName().compareTo(o1.getName());
		}
		
	};
	
	public static void main(String[] args) {
		List l=new ArrayList();
		Student s=new Student();s.setId(101);s.setName("rahul");s.setFee(1200);
		Student s1=new Student();s1.setId(105);s1.setName("kahul");s1.setFee(1100);
		Student s2=new Student();s2.setId(103);s2.setName("rahul");s2.setFee(1100);
		Student s3=new Student();s3.setId(102);s3.setName("kahul");s3.setFee(1200);
		
		l.add(s);l.add(s1);l.add(s2);l.add(s3);
		StudentSortName name=new StudentSortName();
		Collections.sort(l,name.compareById);
		Iterator<Student>it=l.iterator();
		
		
		while(it.hasNext()) {
			Student stu=it.next();
			//System.out.println(stu.getId()+stu.getName()+stu.getFee());
			if(stu.getName().equals("rahul")) {
			System.out.println(stu.getId()+" "+stu.getName()+" "+stu.getFee());
			}
		}
		
		System.out.println("=================================================");
		Collections.sort(l,name.SortByFee);
		Iterator<Student>it1=l.iterator();
		while(it1.hasNext()) {
			Student stu1=it1.next();
			if(stu1.getName().equals("kahul")) {
				System.out.println(stu1.getId()+" "+stu1.getName()+" "+stu1.getFee());
			}
		}
		
		System.out.println("=================================================");
		Collections.sort(l,SortName);
		Iterator<Student>it2=l.iterator();
		while(it2.hasNext()) {
			Student stu2=it2.next();
			if(stu2.getFee()==1100) { 
				System.out.println(stu2.getId()+" "+stu2.getName()+" "+stu2.getFee());
			}else {
				try {
				CustomeException ce=new CustomeException("invalid salary..!!!!!!!");
				throw ce;
					
				} catch (CustomeException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}

}
