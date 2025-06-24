package Algorithms.Searching.BinarySearch;

public class BinarySearchIterative {
    static int binarySearch(int[] arr, int x) {
        int l = 0;
        int r = arr.length - 1;

        while(l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x) {
                return mid; 
            }

            if (x > arr[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2,5,7,8,11,19};
        int x = 11;

        int res = binarySearch(arr, x);
        if (res == -1)
        {
            System.out.println("the element is not present in the array");
        } else {
            System.out.println("The element is present at index " + res);
        }
    }
}