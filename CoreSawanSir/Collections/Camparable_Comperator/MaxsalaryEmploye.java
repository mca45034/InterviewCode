package Camparable_Comperator;

import java.util.ArrayList;
import java.util.Iterator;

class Employes {
	private int e_id;
	private String e_name;
	private int e_salary;
	private static String name="HCL Tech.";
	
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public int getE_salary() {
		return e_salary;
	}
	public void setE_salary(int e_salary) {
		this.e_salary = e_salary;
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		Employes.name = name;
	}
	@Override
	public String toString() {
		return "Employe [e_id=" + e_id + ", e_name=" + e_name + ", e_salary=" + e_salary + "]";
	}
	
	

}


public class MaxsalaryEmploye {
	void maxSalary(ArrayList<Employes>al) {
		Employes em=al.get(0);
		int max=em.getE_salary();
		int a = 0;
		String s = null;
		System.out.println("Company name is..."+Employes.getName());
		for (int j = 0; j < al.size(); j++) {
			Employes emp=al.get(j);
			if(emp.getE_salary()>max) {
				max=emp.getE_salary();
				a=emp.getE_id();
				s=emp.getE_name();
			}
			
		}
		System.out.println("Employe id is : "+ a + "   Employe name is : "+ s + "  maximum salary.: " +max);
	}
	
	void disp(ArrayList<Employes>al)
	{
		System.out.println("-----------------------------");
		Iterator<Employes>it=al.iterator();
		System.out.println("Company name is..."+Employes.getName());
	 while(it.hasNext()) {
		 Employes ep=it.next();
			System.out.println(ep);
		}
	}
		
	public static void main(String[] args) {
		MaxsalaryEmploye em=new MaxsalaryEmploye();
		Employes e1=new Employes();
		e1.setE_id(101);
		e1.setE_name("Sham");
		e1.setE_salary(15400);
		
		Employes e6=new Employes();
		e6.setE_id(100);
		e6.setE_name("Sham");
		e6.setE_salary(1100000);
		
		Employes e2=new Employes();
		e2.setE_id(105);
		e2.setE_name("Dev");
		e2.setE_salary(12700);
		
		Employes e3=new Employes();
		e3.setE_id(120);
		e3.setE_name("lucy");
		e3.setE_salary(13400);
		
		Employes e5=new Employes();
		e5.setE_id(122);
		e5.setE_name("leks");
		e5.setE_salary(1900);
		
		Employes e4=new Employes();
		e4.setE_id(111);
		e4.setE_name("bobs");
		e4.setE_salary(16400);
		
		ArrayList<Employes> al=new ArrayList<Employes>();
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		al.add(e6);
		em.maxSalary(al);
		em.disp(al);
		
		
		

	}

}
