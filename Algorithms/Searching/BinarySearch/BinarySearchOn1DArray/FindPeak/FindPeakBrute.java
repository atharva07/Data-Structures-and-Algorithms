package Algorithms.Searching.BinarySearch.BinarySearchOn1DArray.FindPeak;

import java.util.ArrayList;
import java.util.Arrays;

public class FindPeakBrute {
    // using normal for loop and if condition
    public static int findPeak(ArrayList<Integer> arr) {
        int n = arr.size();

        for(int i = 0; i < n; i++) {
            if ((i == 0 || arr.get(i-1) < arr.get(i)) && (i == n - 1 || arr.get(i) > arr.get(i+ 1))) {
                return i;
            }
        }
        return -1;
    }

    // Time complexity - O(N)

    public static void main(String[] args) {
        ArrayList<Integer> arr =
            new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 5, 1));
        int ans = findPeak(arr);
        System.out.println("The peak is at index: " + ans);
    }
}