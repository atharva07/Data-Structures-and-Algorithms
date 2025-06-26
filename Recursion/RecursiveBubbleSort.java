package Recursion;

public class RecursiveBubbleSort {
    
    public static void recursiveBubbleSort(int[] arr, int n) {
        if (n == 1) {
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i+1] = temp;
            }
        }
        recursiveBubbleSort(arr, n-1);
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.println(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original Array");
        printArray(arr);

        recursiveBubbleSort(arr, arr.length);

        System.out.println("Sorted Array");
        printArray(arr);
    }
}