package ReadWriteFileImages;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;


public class ByKeyboardReadWriteFile {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter txtt....");
		
		FileWriter file=new FileWriter("C:\\Users\\HP\\Desktop\\io\\kirar", true);
		String str=br.readLine();
		while(!str.equalsIgnoreCase("exit")) {
			file.write(str);
			file.write(System.lineSeparator());
			System.out.println(str);
			str=br.readLine();
		}
		br.close();file.close();
	}

}
