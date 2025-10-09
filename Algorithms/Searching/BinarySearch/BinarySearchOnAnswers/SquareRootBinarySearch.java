package Algorithms.Searching.BinarySearch.BinarySearchOnAnswers;

public class SquareRootBinarySearch {
    
    // Find square root of a number in log n
    static int sqrtRootBinary(int num) {
        int low = 1;
        int high = num;
        int ans = 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if ((mid * mid) <= num) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int num = 28;
        int res = sqrtRootBinary(num);
        System.out.println("The Answer is = " + res);
    }
}
