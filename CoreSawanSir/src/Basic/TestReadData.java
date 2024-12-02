package Basic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestReadData {

	public static void main(String[] args) throws IOException {

		String fr = "C:\\Users\\HP\\Desktop\\io\\abc.txt";
		// BufferedReader br = new BufferedReader(new
		// java.io.InputStreamReader(System.in));
		FileReader fw = new FileReader(fr);

		int i = fw.read();

		while (i != -1) {
			System.out.println((char) i);
		}
		fw.close();
	}

}
