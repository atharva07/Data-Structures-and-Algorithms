package TwoPointers;

public class RemoveElement {
    
    public static int removeElement(int[] nums, int val) {
        int left = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[left] = nums[i];
                left++;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;

        int res = removeElement(nums, val);
        System.out.println("Total elements = " + res);
    }
}