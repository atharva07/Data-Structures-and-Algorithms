package SlidingWindow;

import java.util.Arrays;

public class LongestHarmoniousSubsequence {
    public static int findLHS(int[] nums) {
        // using sliding window
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int left = 0; 
        int maxLen = 0;

        for (int right = 0; right < nums.length; right++) {

            // shrink window if difference more than 1
            while (nums[right] - nums[left] > 1) {
                left++;
            }

            if (nums[right] - nums[left] == 1) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,2,2,5,2,3,7};
        int res = findLHS(nums);
        System.out.println("Output = " + res);
    }
}
