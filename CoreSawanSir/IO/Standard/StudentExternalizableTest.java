package Standard;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class StudentExternalizable implements Externalizable {

	transient int id;
transient	public String name;

	public StudentExternalizable() {
		// TODO Auto-generated constructor stub
	}

	public StudentExternalizable(int id, String name) {

		this.id = id;
		this.name = name;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {

		out.writeObject(name);
		out.writeInt(id);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

		name = (String) in.readObject();
		id = in.readInt();

	}

}
public class StudentExternalizableTest {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		StudentExternalizable s = new StudentExternalizable(10, "Rahul");

		ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream("C:\\Users\\hp\\Desktop\\IO\\Externalizable.txt"));

		out.writeObject(s);

		ObjectInputStream in = new ObjectInputStream(
				new FileInputStream("C:\\Users\\hp\\Desktop\\IO\\Externalizable.txt"));

		s = (StudentExternalizable) in.readObject();

		// System.out.println(s);
		System.out.println(s.getId());
		System.out.println(s.getName());

		out.close();
		in.close();
	}

}
