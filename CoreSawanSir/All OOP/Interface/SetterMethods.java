package Interface;
interface Namess{
	public final static String names="Rahul Kirar";
	public  void Employe(String fName,String lName,int age);
}

public class SetterMethods implements Namess{
	String school;
	String bus;
	int fee;
	
	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getBus() {
		return bus;
	}

	public void setBus(String bus) {
		this.bus = bus;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}
	
//	public void disp() {
//		System.out.println(school);
//		System.out.println(fee);
//		System.out.println(names);
//	}

	@Override
	public void Employe(String fName, String lName, int age) {
		System.out.println(fName);
		System.out.println(lName);
		System.out.println(age);
		System.out.println(names);
		
	}

	public static void main(String[] args) {
		SetterMethods s=new SetterMethods();
		s.setSchool("ncs");
		s.setBus("tata");
		s.setFee(2388);
		s.Employe("sham", "sharma", 21);
		System.out.println(s.getBus());
		System.out.println(s.getFee());
		System.out.println(s.getSchool());


	}

	

}
