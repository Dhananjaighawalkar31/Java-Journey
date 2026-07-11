package WriteFile;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try(FileWriter writer = new FileWriter("C:\\Users\\Admin\\Desktop\\test.txt")){
			writer.write("i like pizza");
			System.out.println("file has been written");
		}
		catch(IOException e) {
			System.out.println("could not write file");
		}
				
	}

}
