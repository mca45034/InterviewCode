package Standard;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EmailReadWrite {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\hp\\Desktop\\IO\\blackEmail.txt"));
		PrintWriter line=new PrintWriter(new FileWriter("C:\\Users\\hp\\Desktop\\IO\\Email.txt"));
		String str=br.readLine();
		String regex="^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+" + "(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		while(str !=null) {
			if(str.matches(regex)) {
				line.println(str);
			}
			str=br.readLine();
		}
		System.out.println("done>>>>>>>>");
		br.close();
		line.close();
	}

}
