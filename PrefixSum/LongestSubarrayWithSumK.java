package PrefixSum;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithSumK {
    
    public static int longestSubarraySumK(int[] arr, int k) {
        Map<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1);
        int count = 0;
        int prefixSum = 0;

        for (int num : arr) {
            prefixSum += num;

            if (prefixSumCount.containsKey(prefixSum - k)) {
                count += prefixSumCount.get(prefixSum - k);
            }

            prefixSumCount.put(prefixSum, prefixSumCount.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5,2,7,1,9};
        int k = 15;
        System.out.println("Longest Subarray Sum = " + longestSubarraySumK(arr, k));
    }
}
