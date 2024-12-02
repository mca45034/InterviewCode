package ReadWriteFileImages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteImageBinaryDataFileInputStream {
	public static void main(String[] args) throws IOException {
		String source = "C:\\Users\\HP\\Desktop\\io\\java_basic certificate_page-0001.jpg";
		// anothr folder me dal rhe he folder name user difine and create itself
		String target = "C:\\Users\\HP\\Desktop\\database\\cartificate.jpg";
		FileInputStream in = new FileInputStream(source);
		FileOutputStream out = new FileOutputStream(target);

		int i = in.read();
		while (i != -1) {
			out.write(i);
			i = in.read();
		}
		System.out.println("done.....!!!!!!!!!!");
		in.close();
		out.close();

	}

}
