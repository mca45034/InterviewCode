package Standard;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Marksheet implements Serializable {

	public int id = 0;
	public String name = null;
	public int physics = 0;
	public int chemistry = 0;
	public int maths = 0;
	public transient int total = 0;
	

}


public class DeSeriealizable {
	public static void main(String[] args) throws Exception {

		FileInputStream file = new FileInputStream("C:\\Users\\HP\\Desktop\\io\\kirar.txt");

		ObjectInputStream in = new ObjectInputStream(file);

		Marksheet m = (Marksheet) in.readObject();

		System.out.println("id = " + m.id);
		System.out.println("name = " + m.name);
		System.out.println("physics = " + m.physics);
		System.out.println("chemistry = " + m.chemistry);
		System.out.println("maths = " + m.maths);
		System.out.println("total = " + m.total);

		in.close();
		file.close();

	}

}
