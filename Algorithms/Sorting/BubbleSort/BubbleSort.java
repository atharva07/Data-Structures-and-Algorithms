package Algorithms.Sorting.BubbleSort;

public class BubbleSort {
    
    static void bubbleSort(int[] arr, int n) {
        for (int i = n-1; i >= 0; i--) {     // ---- n
            for (int j = 0; j <= i - 1; j++) {     // ----- n
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Time complexity - n * n = n^2
        // O(N^2)
        System.out.println("After bubble sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Before Using Bubble Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubbleSort(arr, n);
    }
}
