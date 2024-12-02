package Camparable_Comperator;

import java.util.ArrayList;

class Studentfee{
	int id;
	String name;
	int fee;
	public Studentfee(int id, String name, int fee) {
		
		this.id = id;
		this.name = name;
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fee=" + fee + "]";
	}
	
}

public class StudentMaxFee {
	public static void maxFee(ArrayList<Studentfee>al) {
		Studentfee stu=al.get(0);
		int max=stu.fee;
		int a=0;
		String s=null;
		for(int i=0;i<al.size();i++) {
			Studentfee st=al.get(i);
			if(st.fee>max) {
				max=st.fee;
				a=st.id;
				s=st.name;
			}
		}
		System.out.println(a+" "+s+" "+max);
	}
	public static void main(String[] args) {
		ArrayList<Studentfee>al=new ArrayList<Studentfee>();
		al.add(new Studentfee(101, "sham", 400));
		al.add(new Studentfee(103, "ram", 500));
		al.add(new Studentfee(105, "rahul", 900));
		al.add(new Studentfee(1018, "ankit", 300));
		maxFee(al);
	}

}
