package hackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {

    public static int maxMin(int k, int[] arr) {
        Arrays.sort(arr);

        int n = arr.length;
        int minUnfairness = Integer.MAX_VALUE;

        for (int i = 0; i <= n - k; i++) {
            int unfairness = arr[i + k - 1] - arr[i];
            minUnfairness = Math.min(minUnfairness, unfairness);
        }

        return minUnfairness;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(maxMin(k, arr));

        sc.close();
    }
}
