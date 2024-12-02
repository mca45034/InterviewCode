package Comperators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EmployeTest {
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(new Employe(101, "rahul", "it", 1200));
		l.add(new Employe(109, "kirar", "it", 1400));
		l.add(new Employe(103, "sham", "hr", 1800));
		l.add(new Employe(101, "rahul", "tester", 100));
		
//		EmployeSortName name=new EmployeSortName();
//		Collections.sort(l,name);
//		Iterator<Employe>it=l.iterator();
//		while(it.hasNext()) {
//			Employe emp=it.next();
//			if(emp.salary==1200) {
//			System.out.println(emp);
//			}
//		}
		
		System.out.println("=============================================");
		EmployeSortInt id=new EmployeSortInt();
		Collections.sort(l,id);
		Iterator<Employe>it1=l.iterator();
		while(it1.hasNext()) {
			Employe emp1=it1.next();
			//if(emp1.name.equals("rahul")) {
				System.out.println(emp1);
			//}
		}
		
	}

}
