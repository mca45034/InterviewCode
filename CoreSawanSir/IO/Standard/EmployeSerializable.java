package Standard;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employe implements Serializable{
	transient int id;
	transient	String name;
	String dep;
	
	public Employe(int id, String name, String dep) {
		super();
		this.id = id;
		this.name = name;
		this.dep = dep;
	}
	
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", dep=" + dep + "]";
	}
	
	
}

public class EmployeSerializable {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Employe emp=new Employe(10, "rahul", "hr");
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("C:\\Users\\hp\\Desktop\\IO\\rahul.txt"));
		out.writeObject(emp);
		out.close();
		
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\Users\\hp\\Desktop\\IO\\rahul.txt"));
		emp=(Employe) in.readObject();
		System.out.println(emp);
		
		
	}

}
