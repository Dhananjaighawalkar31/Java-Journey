package fileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class A02 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\OneDrive\\Desktop\\Java Programs\\Files learning\\A01.txt");
		while(true) {
			int n = fis.read();
			if(n==-1) {
				break;
			}
			System.out.println((char)n);
		}
		

	}

}
