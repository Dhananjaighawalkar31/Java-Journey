package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class SubarraysWithKDistinct {

    public int subarraysWithKDistinct(int[] nums, int k) {
        return func(nums, k) - func(nums, k - 1);
    }

    public int func(int[] arr, int target) {

        if (target < 0) {
            return 0;
        }

        int r = 0, l = 0, c = 0;
        int n = arr.length;

        Map<Integer, Integer> map = new HashMap<>();

        while (r < n) {

            map.put(arr[r], map.getOrDefault(arr[r], 0) + 1);

            while (map.size() > target) {

                map.put(arr[l], map.get(arr[l]) - 1);

                if (map.get(arr[l]) == 0) {
                    map.remove(arr[l]);
                }

                l++;
            }

            c += r - l + 1;
            r++;
        }

        return c;
    }

    public static void main(String[] args) {

        SubarraysWithKDistinct solution = new SubarraysWithKDistinct();

        int[] nums1 = {1, 2, 1, 2, 3};
        System.out.println(solution.subarraysWithKDistinct(nums1, 2));

        int[] nums2 = {1, 2, 1, 3, 4};
        System.out.println(solution.subarraysWithKDistinct(nums2, 3));
    }
}