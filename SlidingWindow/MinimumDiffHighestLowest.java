package SlidingWindow;

import java.util.Arrays;

public class MinimumDiffHighestLowest {
    
    public static int minimumDifference(int[] nums, int k) {

        if (k == 1) {
            return 0;
        }

        Arrays.sort(nums);
        int min_diff = Integer.MAX_VALUE;
        int n = nums.length;

        // we are using [i+k-1] to get an acess to particular element
        for (int i = 0; i <= n - k; i++) {
            int diff = nums[i + k - 1] - nums[i];
            min_diff = Math.min(min_diff, diff);
        }

        return min_diff;
    }

    public static void main(String[] args) {
        int[] arr = {9,4,1,7};
        int k = 2;

        int res = minimumDifference(arr, k);
        System.out.println("Minimum score : " + res);
    }
}
