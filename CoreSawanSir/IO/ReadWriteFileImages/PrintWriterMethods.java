package ReadWriteFileImages;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterMethods {
	public static void main(String[] args) throws IOException {
		FileWriter reader=new FileWriter("C:\\Users\\HP\\Desktop\\io\\rahul.txt");
		PrintWriter line=new PrintWriter(reader);
		line.println("my name rahul");
		line.println("i am very bad person");
		reader.close();
		line.close();
		System.out.println("done....!!!!!!!!!!!!!!!!!!!!!!!!!!");
		
	}

}
