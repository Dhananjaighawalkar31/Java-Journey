package LeetCode;

public class MinimumWindowSubstring {

    public String minWindow(String s, String t) {

        int[] hash = new int[256];

        int n = s.length();
        int r = 0, l = 0;
        int c = 0;

        int minLen = Integer.MAX_VALUE;
        int si = -1;

        for (char ch : t.toCharArray()) {
            hash[ch]++;
        }

        int k = t.length();

        while (r < n) {

            char rightChar = s.charAt(r);

            if (hash[rightChar] > 0) {
                c++;
            }

            hash[rightChar]--;

            while (c == k) {

                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    si = l;
                }

                char leftChar = s.charAt(l);

                hash[leftChar]++;

                if (hash[leftChar] > 0) {
                    c--;
                }

                l++;
            }

            r++;
        }

        return si == -1 ? "" : s.substring(si, si + minLen);
    }
}