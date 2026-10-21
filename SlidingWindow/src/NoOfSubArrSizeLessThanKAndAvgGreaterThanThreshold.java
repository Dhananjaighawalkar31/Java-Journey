public class NoOfSubArrSizeLessThanKAndAvgGreaterThanThreshold {
//    1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int sum = 0;
        for(int i = 0;i<k;i++){
            sum += arr[i];
        }
        int c = 0;
        if(sum>= k * threshold){
            c++;
        }
        int l = 0;
        int r = k;
        while(r<n){
            sum = sum - arr[l];
            l++;
            sum = sum + arr[r];
            r++;
            if(sum>= k * threshold){
                c++;
            }
        }
        return c;
    }
}
