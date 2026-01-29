package Algorithms.Searching.BinarySearch;

public class BinarySearchRecursive {
    
    static int binarySearch(int[] arr, int low, int high, int target) {

        if (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (target > arr[mid]) {
                return binarySearch(arr, mid + 1, high, target);
            } else {
                return binarySearch(arr, low, mid - 1, target);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = binarySearch(arr, 0, n-1, x);
        if (result == -1) {
            System.out.println("Element not present in Array");
        } else {
            System.out.println("Array is present at index = " + result);
        }
    }
}
