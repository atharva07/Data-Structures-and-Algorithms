package PrefixSum;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    
    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> sumCount = new HashMap<>();
        // in map we initialize -> prefixSum = 0, count = 0, sumCount = {0,1}
        sumCount.put(0, 1);
        int prefixSum = 0; 
        int count = 0;

        for (int num : nums) {
            prefixSum += num;
            if (sumCount.containsKey(prefixSum - k)) {
                count += sumCount.get(prefixSum - k);
            }
            sumCount.put(prefixSum, sumCount.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 5;
        System.out.println("Total Sub array Sum = " + subarraySum(arr, k));
    }
}
