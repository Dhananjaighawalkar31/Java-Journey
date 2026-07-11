package fundamentals;

import java.util.Scanner;

public class MultipeFour {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 1;
        int present = 1;
        while (count <= n) {
            int num = 3 * present + 2;
            if (num % 4 != 0) {
                System.out.println(num);
                count++;
            }
            present++;
        }
        s.close(); // It's good practice to close the Scanner
    } // End of main method
} // End of class

