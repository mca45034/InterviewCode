package Standard;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {
	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("C:\\Users\\HP\\Desktop\\io\\kirar.txt",true);

		char[] charArry = { 'h', 'i' };

		fw.write(charArry);
		fw.write(',');
		fw.write("SunilOS");
		fw.write(45);

		System.out.println("Sucessfully........");

		fw.close();
	}
}
