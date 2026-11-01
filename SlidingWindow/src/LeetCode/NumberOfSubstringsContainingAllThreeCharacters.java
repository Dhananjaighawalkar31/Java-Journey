package LeetCode;

public class NumberOfSubstringsContainingAllThreeCharacters {

    public static int numberOfSubstrings(String s) {
        int[] lastSeen = {-1, -1, -1};
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            lastSeen[ch - 'a'] = i;

            int minIndex = Math.min(
                    lastSeen[0],
                    Math.min(lastSeen[1], lastSeen[2])
            );

            if (minIndex != -1) {
                count += minIndex + 1;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "abcabc";

        System.out.println(numberOfSubstrings(s));
    }
}