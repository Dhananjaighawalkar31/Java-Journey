package recursionthree;

import java.util.ArrayList;

public class PrintPermutation {
	private  static ArrayList<String> ans = new ArrayList<>();

	public static ArrayList<String> FindPermutation(String str){
		char[] arr = str.toCharArray();
		helper(arr, 0 , arr.length - 1);
		return ans;
	}
	private static void helper(char[] a, int i, int j) {
		if(i >= j) {
			String permutation = "";
			for(int k = 0;k< a.length;k++) {
				permutation += (a[k]);
			}

			ans.add(permutation);
			return;
		}
		for(int k=i ;k<=j;k++) {
			swap(a, i, k);
			helper(a, i+ 1,j);
			swap(a, i , k);
		}
	}
	private static void swap(char[] a,int i, int j) {
		char temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	public static void main(String[] args) {
		String input = "abc";
		ArrayList<String> permutations = FindPermutation(input);
		for (String permutation : permutations) {
			System.out.println(permutation);
		}

	}

}
