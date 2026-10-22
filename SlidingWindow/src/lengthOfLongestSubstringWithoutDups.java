public class lengthOfLongestSubstringWithoutDups {

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int r = 0,l = 0, max = 0;
        boolean seen[] = new boolean[128];
        while(r<n){
            char ch = s.charAt(r);
            int i = ch;
            while(seen[i]){
                char leftChar = s.charAt(l);
                seen[leftChar] = false;
                l++;
            }
            max = Math.max(max,r-l+1);
            seen[i] = true;

            r++;


        }
        return max;
    }
}
