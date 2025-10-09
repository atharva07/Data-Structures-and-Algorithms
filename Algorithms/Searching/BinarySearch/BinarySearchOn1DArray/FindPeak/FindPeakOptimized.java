package Algorithms.Searching.BinarySearch.BinarySearchOn1DArray.FindPeak;

import java.util.ArrayList;
import java.util.Arrays;

public class FindPeakOptimized {
    
    public static int findPeak(ArrayList<Integer> arr) {
        int n = arr.size();

        if (n == 1) return 0;
        if (arr.get(0) > arr.get(1)) return 0; // first index
        if (arr.get(n-1) > arr.get(n -2)) return n -1; // last index

        int low = 1;
        int high = n - 2; // to avoid out of bound and handle edge case separately
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr.get(mid - 1) < arr.get(mid) && arr.get(mid) < arr.get(mid + 1)) {
                return mid;
            }

            if (arr.get(mid) > arr.get(mid - 1)) {
                low = mid + 1; // push right
            } else {
                high = mid - 1; // push left
            }
        }
        return -1;
    }
    // Time Complexity - O(log n)
    // Space Complexity - O(1)

    public static void main(String[] args) {
        ArrayList<Integer> arr =
            new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 5, 1));
        int ans = findPeak(arr);
        System.out.println("The peak is at index: " + ans);
    }
}
