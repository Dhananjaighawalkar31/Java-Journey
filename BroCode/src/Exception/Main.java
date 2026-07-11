package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {



		try (Scanner s = new Scanner(System.in)){
			System.out.print("enter a number: ");
			int number = s.nextInt();
			System.out.println(number);
		}
		catch(InputMismatchException e){
			System.out.println("its not a integer");
		}
		catch(ArithmeticException e){
			System.out.println("you cant divide");
		}
		finally {
			System.out.println("this always executes");
		}
		//		System.out.println(1 / 0);

	}

}
