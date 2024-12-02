package Standard;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MargToInOne {
	public static void main(String[] args) throws IOException {
		FileWriter file=new FileWriter("C:\\Users\\HP\\Desktop\\io\\sham.txt");
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\io\\rahul.txt"));
		String str=br.readLine();
		while(str !=null) {
			file.write(str);
			str=br.readLine();
		}
		br.close();
		
		BufferedReader br1=new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\io\\abc.txt"));
		String str1=br1.readLine();
		while(str1 !=null) {
			file.write(str1);
			str1=br1.readLine();
			
		}
		System.out.println("done....!!!!");
		br1.close();
		file.close();
	}

}
