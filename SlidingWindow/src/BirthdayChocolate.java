import java.util.Scanner;

public class BirthdayChocolate {

    public static int birthday(int[] s, int d, int m) {
        int n = s.length;

        if (m > n) {
            return 0;
        }

        int sum = 0;
        int count = 0;

        // Calculate the first window
        for (int i = 0; i < m; i++) {
            sum += s[i];
        }

        if (sum == d) {
            count++;
        }

        // Slide the window
        for (int i = m; i < n; i++) {
            sum += s[i];
            sum -= s[i - m];

            if (sum == d) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of chocolate squares
        int n = sc.nextInt();

        // Values on the chocolate squares
        int[] s = new int[n];

        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }

        // Ron's birth day and month
        int d = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(birthday(s, d, m));

        sc.close();
    }
}

