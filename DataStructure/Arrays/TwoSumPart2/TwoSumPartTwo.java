package DataStructure.Arrays.TwoSumPart2;

public class TwoSumPartTwo {
    
    public static int[] twoSum(int[] numbers, int target) {

        int n = numbers.length;
        int left = 0;   
        int right = n - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left+1, right+1};
                
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }

    // Time complexity - O(N)

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] ans = twoSum(arr, target);
        //System.out.println("The answer is = " + Arrays.toString(ans));
        for (int n : ans) {
            System.out.println(n);
        }
    }
}
