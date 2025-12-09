package PrefixSum;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithSumK {
    
    public static int longestSubarraySumK(int[] arr, int k) {
        Map<Integer, Integer> sumIndexMap = new HashMap<>();
        sumIndexMap.put(0, -1);
        int prefixSum = 0, maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            if (sumIndexMap.containsKey(prefixSum - k)) {
                int currentLen = i - sumIndexMap.get(prefixSum - k);
                maxLen = Math.max(maxLen, currentLen);
            }
            sumIndexMap.putIfAbsent(prefixSum, i);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {10,5,2,7,1,9};
        int k = 15;
        System.out.println("Longest Subarray Sum = " + longestSubarraySumK(arr, k));
    }
}
