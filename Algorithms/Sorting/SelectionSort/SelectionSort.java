package Algorithms.Sorting.SelectionSort;

public class SelectionSort {
    
    static void selection_sort(int[] arr, int n) {
        for (int i = 0; i < n-1; i++) { // --- n
            int min = i;
            for (int j = i + 1; j < n; j++) {  // --- n
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        // n * n = n^2
        // Time complexity = O(N^2)
        // we do ignore the constant values while calculating the time complexity

        System.out.println("After Selection Sort");
        for(int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {

        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Before selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        selection_sort(arr, n);
    }
}
