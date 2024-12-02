package Basics;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class URLReader {
	public static void main(String[] args) throws IOException {
		URL url=new URL("https://www.javatpoint.com/set-vs-map-in-java");
		System.out.println(url.getProtocol());
		System.out.println(url.getHost());
		System.out.println(url.getPort());
		System.out.println(url.getFile());
		System.out.println(url.getDefaultPort());
		
		InputStream in=url.openStream();
		Scanner sc=new Scanner(in);
		while(sc.hasNext()) {
			String s=sc.nextLine();
			System.out.println(s);
		}
		in.close();
	}

}
