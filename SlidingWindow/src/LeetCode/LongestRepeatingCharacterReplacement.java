package LeetCode;

public class LongestRepeatingCharacterReplacement {

    public static int characterReplacement(String s, int k) {

        int l = 0, r = 0, maxLen = 0, maxf = 0;
        int n = s.length();

        int[] hash = new int[26];

        while (r < n) {

            char ch = s.charAt(r);

            hash[ch - 'A']++;

            maxf = Math.max(maxf, hash[ch - 'A']);

            if ((r - l + 1) - maxf > k) {
                hash[s.charAt(l) - 'A']--;
                l++;
            }

            if ((r - l + 1) - maxf <= k) {
                maxLen = Math.max(maxLen, r - l + 1);
            }

            r++;
        }

        return maxLen;
    }

    public static void main(String[] args) {

        System.out.println(characterReplacement("ABAB", 2));
        System.out.println(characterReplacement("AABABBA", 1));
    }
}