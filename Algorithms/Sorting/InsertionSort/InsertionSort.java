package Algorithms.Sorting.InsertionSort;

public class InsertionSort {
    
    static void insertionSort(int[] arr, int n) {
        for (int i = 0; i <= n - 1; i++) {  // ---- n times
            int j = i; 
            while(j > 0 && arr[j - 1] > arr[j]) { // 
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        System.out.println("After insertion sort");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Before Using insertion Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        insertionSort(arr, n);
    }
}
