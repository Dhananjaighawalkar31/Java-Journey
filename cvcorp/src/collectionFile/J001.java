
package collectionFile;

import java.io.File;
import java.io.IOException;

public class J001 {

	public static void main(String[] args) {
		File a = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Java Programs\\Files learning/j002.txt");
		try {
			System.out.println(a.createNewFile());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println(a.canRead());
		
		System.out.println(a.setWritable(true));
		System.out.println(a.canWrite());

	}

}
