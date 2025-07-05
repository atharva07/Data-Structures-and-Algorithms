package DataStructure.Arrays;

import java.util.HashMap;

public class LongestSubArrayZeroSum {
    
    public static int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> sumIndexMap = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum == 0) {
                maxLen += 1;
            } else if (sumIndexMap.containsKey(sum)) {
                int prevIndex = sumIndexMap.get(sum);
                maxLen = Math.max(maxLen, i - prevIndex);
            } else {
                sumIndexMap.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println("Length of the longest subarray with sum zero: " + findMaxLength(arr));
    }
}
