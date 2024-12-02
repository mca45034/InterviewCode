package Standard;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWritePrametiveDataType {
	public static void main(String[] args) throws IOException {
		DataOutputStream out=new DataOutputStream(new FileOutputStream("C:\\Users\\hp\\Desktop\\IO\\prametive"));
		out.writeInt(345);
		out.writeLong(55L);
		out.writeChar('r');
		out.writeBoolean(true);
		out.writeFloat(65.77f);
		out.close();
		DataInputStream in=new DataInputStream(new FileInputStream("C:\\Users\\hp\\Desktop\\IO\\prametive"));
		System.out.println(in.readInt());
		System.out.println(in.readLong());
		System.out.println(in.readChar());
		System.out.println(in.readBoolean());
		System.out.println(in.readFloat());
		in.close();
		
	}

}
