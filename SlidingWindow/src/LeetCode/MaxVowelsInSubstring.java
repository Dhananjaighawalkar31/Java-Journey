class MaxVowelsInSubstring {
    public int maxVowels(String s, int k) {
        int n = s.length();
        String vowels = "aeiou";
        int count = 0;

        // Count vowels in the first window
        for (int i = 0; i < k; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                count++;
            }
        }

        int max = count;

        // Slide the window
        for (int r = k; r < n; r++) {
            if (vowels.indexOf(s.charAt(r)) != -1) {
                count++;
            }

            if (vowels.indexOf(s.charAt(r - k)) != -1) {
                count--;
            }

            max = Math.max(max, count);
        }

        return max;
    }
}

