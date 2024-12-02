package ReadWriteFileImages;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileWithScanner {
	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("C:\\Users\\HP\\Desktop\\io\\rahul.txt");
		Scanner sc = new Scanner(reader);
		while (sc.hasNext()) {
			String str = sc.nextLine();
			System.out.println(str);

		}
		reader.close();
	}

}
