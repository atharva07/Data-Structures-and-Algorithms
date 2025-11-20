package SlidingWindow;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate2 {
    
    public static boolean containsDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (right - left > k) {
                window.remove(nums[left]);
                left++;
            }

            if (window.contains(nums[right])) {
                return true;
            }

            window.add(nums[right]);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        int k = 3;
        boolean res = containsDuplicate(arr, k);
        System.out.println(res);
    }
}
