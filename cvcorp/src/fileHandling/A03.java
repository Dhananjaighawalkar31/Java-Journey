package fileHandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class A03 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\OneDrive\\Desktop\\Java Programs\\Files learning\\A02.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		bos.write(65);
		byte[] a = {66,67,68,69,70};
		bos.write(a);
		bos.close();

		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\OneDrive\\Desktop\\Java Programs\\Files learning\\A02.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		while(true) {
			int n = bis.read();
			if(n==-1) {
				break;
			}
			System.out.println((char)n);
		}
	}

}
