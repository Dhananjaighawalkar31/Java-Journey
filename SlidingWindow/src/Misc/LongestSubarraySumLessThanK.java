package Misc;

public class LongestSubarraySumLessThanK {
//    pattern 2
    public int m1(int[] arr , int k){
        int n = arr.length;
        int l = 0,r = 0,maxLen = 0,sum = 0;
        while(r < n){
            sum = sum + arr[r];
            if(sum > k){
                sum = sum - arr[l];
                l++;
            }
            if(sum<= k){
                maxLen = Math.max(maxLen,r-l+1);
            }
            r++;
        }
        return maxLen;
    }
}
