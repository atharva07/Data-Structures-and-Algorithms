package DataStructure.Arrays.TwoSum;

import java.util.HashMap;

public class TwoSumBetter {
    
    public static String twoSumBetter(int n, int[] arr, int target) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int moreNeeded = target - num;
            if (mpp.containsKey(moreNeeded)) {
                return "YES";
            }
            System.out.println("Key = " + arr[i] + " Value = " + i);
            mpp.put(arr[i], i);
        }
        return "NO";
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        String ans = twoSumBetter(n, arr, target);
        System.out.println("The answer is = " + ans);
    }

    // The Time complexity is -> O(n)
    // The Space complexity is -> O(N) = because we are using map to store the response
}