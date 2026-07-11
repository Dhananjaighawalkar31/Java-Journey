package fileHandling;


import java.io.FileOutputStream;

public class J001 {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\OneDrive\\Desktop\\Java Programs\\Files learning\\A01.txt");
		fos.write(65);
		byte[] a = {66,67,68,69,70};
		fos.write(a);
		fos.close();
	}
}
