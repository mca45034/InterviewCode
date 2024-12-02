package ReadWriteFileImages;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example {
	public static void main(String[] args) throws IOException, ClassNotFoundException,FileNotFoundException {
		String source="C:\\Users\\HP\\Desktop\\io\\java_basic certificate_page-0001.jpg";
		String target="C:\\Users\\HP\\Desktop\\io\\ankit.jpg";
		FileInputStream in=new FileInputStream(source);
		FileOutputStream out=new FileOutputStream(target);
		BufferedInputStream iin=new BufferedInputStream(in);
		BufferedOutputStream oout=new BufferedOutputStream(out);
		int i=iin.read();
		while(i !=-1) {
			out.write(i);
			i=iin.read();
		}
		System.out.println("donesss");
		in.close();
		out.close();
		iin.close();
		oout.close();
	}
}
