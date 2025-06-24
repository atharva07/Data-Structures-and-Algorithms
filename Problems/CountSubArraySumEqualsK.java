package Problems;

import java.util.HashMap;
import java.util.Map;

public class CountSubArraySumEqualsK {
    
    public static int findAllSubArrayWithGivenSum(int arr[], int k) {
        int n = arr.length;
        Map<Integer, Integer> mpp = new HashMap<>();
        int preSum = 0, cnt = 0;

        mpp.put(0, 1);
        for (int i = 0; i < n; i++) {

            // Add currrent Element to Prefix Sum
            preSum += arr[i];

            // Calculate x-k
            int remove = preSum - k;

            // Add the number of SubArrays to be removed:
            cnt += mpp.getOrDefault(remove, 0);

            // Update the count of prefix sum in the map
            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        int k = 6;
        int cnt = findAllSubArrayWithGivenSum(arr, k);
        System.out.println("The number of SubArrays are : " + cnt);
    }
}
