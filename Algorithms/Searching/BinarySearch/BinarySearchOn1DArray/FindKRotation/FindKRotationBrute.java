package Algorithms.Searching.BinarySearch.BinarySearchOn1DArray.FindKRotation;

public class FindKRotationBrute {
    
    public static int findKRotation(int[] arr) {
        int n = arr.length;
        int ans = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
                index = i;
            }
        }
        return index;
    }
    // Time Complexity - O(N)
    // Space Complexity - O(1)

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        int ans = findKRotation(arr);
        System.out.println("The array is rotated " + ans + " times.");
    }
}