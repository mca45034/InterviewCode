package Clones;
class Student implements Cloneable{
	int id;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
class Student1 implements Cloneable{
	String name;
	Student s=new Student();
	public Student1(String name,int id) {
		this.name=name;
		this.s.id=id;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		Student1 s1=(Student1) super.clone();
		s1.s=(Student)s.clone();
		return s1;
	}
}

public class DeepClonStudent {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student1 stu=new Student1("ram", 123);
		Student1 stu1=(Student1) stu.clone();
		stu1.name="dev";
		stu1.s.id=909;
		System.out.println(stu.s.id);
		System.out.println(stu.name);
		System.out.println(stu1.s.id);System.out.println(stu1.name);
	}

}
