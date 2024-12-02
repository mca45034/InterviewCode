package ReadWriteFileImages;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class OneFileToAnthoreFileConvertLineByLine {
	public static void main(String[] args) throws IOException {

		FileReader reader = new FileReader("C:\\Users\\HP\\Desktop\\io\\abc.txt");
		BufferedReader br = new BufferedReader(reader);

		FileWriter fw = new FileWriter("C:\\Users\\HP\\Desktop\\io\\rahul.txt");
		BufferedWriter bw = new BufferedWriter(fw);
 
		String str = br.readLine();

		while (str != null) {
			System.out.println(str);
			bw.write(str);
			bw.newLine(); 
			str = br.readLine();
		}

		reader.close();
		br.close();
		bw.close();
		fw.close();
		
		
	}

}
