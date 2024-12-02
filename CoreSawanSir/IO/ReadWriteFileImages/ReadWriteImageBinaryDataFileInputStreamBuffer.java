package ReadWriteFileImages;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteImageBinaryDataFileInputStreamBuffer {
	public static void main(String[] args) throws IOException {
		String source = "C:\\Users\\HP\\Desktop\\io\\java_basic certificate_page-0001.jpg";
		String target = "C:\\Users\\HP\\Desktop\\database\\cartificate.jpg";
		FileInputStream in = new FileInputStream(source);
		FileOutputStream out = new FileOutputStream(target);
		BufferedInputStream iin=new BufferedInputStream(in);
		BufferedOutputStream oout=new BufferedOutputStream(out);
		byte[] buff=new byte[256];
		int count=iin.read(buff);
		while(count>0) {
			oout.write(buff,0,count);
			iin.read(buff);
		}
		System.out.println("DONE........");
		in.close();out.close();iin.close();oout.close();

	}

}
