package DataStructure.Arrays.FourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSumOptimal {
    
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            for (int j = i + 1; j < n; j++) {
                if (j > i && nums[j] == nums[j - 1]) {
                    continue;
                }

                int left = j + 1;
                int right = n - 1;
                int remainingTaget = target - nums[i] - nums[j];

                while (left < right) {
                    int currentSum = nums[left] + nums[right];
                    if (currentSum == remainingTaget) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }

                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        
                        left++;
                        right--;
                    } else if (currentSum < remainingTaget) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> res = new ArrayList<>();
        res = fourSum(arr, target);
        System.out.println(res);
    }
}