package DataStructure.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumToEqualZero {
    
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        // In this two pointer approach is used
        int n = nums.length;

        for (int i = 0; i < n-2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // skip duplicate element for i
            }

            int left = i + 1;
            int right = n - 1;
            int target = -nums[i];

            while (left < right) {
                int currentSum = nums[left] + nums[right];
                if (currentSum == target) {
                    // if the currentSum == target i.e. b + c = -a, then we will store the triplet
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // skip duplicates for left and right
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (currentSum < target) {
                    // If the sum is too small, move left pointer towards right by 1
                    left++;
                } else {
                    // If the sum is too large, move right pointer towards left by 1
                    right--;
                }
            }
        }
        return result; 
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> res = new ArrayList<>();
        res = threeSum(arr);
        System.out.println(res);
    }
}
