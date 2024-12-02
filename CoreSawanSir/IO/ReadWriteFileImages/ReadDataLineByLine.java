package ReadWriteFileImages;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataLineByLine {
	public static void main(String[] args) throws IOException {
		FileReader reader=new FileReader("C:\\Users\\HP\\Desktop\\io\\abc.txt");
		BufferedReader br=new BufferedReader(reader);
		String str=br.readLine();
		while(str !=null) {
			System.out.println(str);
			str=br.readLine();
		}
		reader.close();
		br.close();
		
	}

}
