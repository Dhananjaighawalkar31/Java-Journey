package collectionsProperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class J001 {

	public static void main(String[] args) throws FileNotFoundException {
		Properties p = new Properties();
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\OneDrive\\Desktop\\Java Programs\\new.prop\\hi.txt");
		p.setProperty("dhanu", "1");
		p.setProperty("teja", "2");
		try {
			p.store(fos,"first");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println(p);
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\OneDrive\\Desktop\\Java Programs\\new.prop\\hi.txt");
		try {
			p.load(fis);
		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println(p);

	}

}
