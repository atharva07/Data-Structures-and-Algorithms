package SlidingWindow;

public class MaximumAverageSubArray1 {
    
    public static double findMaxAverage(int[] nums, int k) {
        // Calculate the sum of first window
        double windowSum = 0;
        for (int i =0; i < k; i++) {
            windowSum += nums[i];
        }

        // Initialize maxSum with first window sum
        double maxSum = windowSum;

        // slide the window
        for (int i = k; i < nums.length; i++) {
            // remove the left element and add the right element
            windowSum = windowSum - nums[i - k] + nums[i];

            // update the maxSum
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum/k;
    }

    public static void main(String[] args) {
        int[] arr = {1,12,-5,-6,50,3};
        int k = 4;

        double res = findMaxAverage(arr, k);
        System.out.println(res);
    }
}
