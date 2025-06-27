package Recursion;

public class RecursiveInsertionSort {
    
    // Recursive function to insert an element into sorted array
    private static void insert(int[] arr, int n) {
        if (n <= 1) {
            return;
        }

        // sort the first n - 1 element
        insert(arr, n-1);

        // Insert last element into correct position
        int key = arr[n-1];
        int j = n -2;

        // Shift elements greater than key to right
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }

    // Recursive insertion sort
    public static void insertionSort(int[] arr, int n) {
        if (n <= 1) {
            return;
        }

        // Sort first n - 1 element
        insertionSort(arr, n-1);
        
        // Insert last element into sorted array
        insert(arr, n);
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};

        System.out.println("Original Array");
        for (int num : arr) {
            System.out.println(num + " ");
        }
        System.out.println();

        insertionSort(arr, arr.length);

        System.out.println("Sorted Array");
        for(int num : arr) {
            System.out.println(num + " ");
        }
    }
}
