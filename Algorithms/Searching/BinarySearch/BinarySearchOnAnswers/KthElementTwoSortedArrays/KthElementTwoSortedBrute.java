package Algorithms.Searching.BinarySearch.BinarySearchOnAnswers.KthElementTwoSortedArrays;

import java.util.ArrayList;

public class KthElementTwoSortedBrute {
    
    public static int kthElement(ArrayList<Integer> a, ArrayList<Integer> b, int m, int n, int k) {
        ArrayList<Integer> arr3 = new ArrayList<>();

        int i = 0;
        int j = 0;
        while (i < m && j < n) {
            if (a.get(i) < b.get(j)) {
                arr3.add(a.get(i++));
            } else {
                arr3.add(b.get(j++));
            }
        }

        while (i < m) {
            arr3.add(a.get(i++));
        }

        while (j < n) {
            arr3.add(b.get(j++));
        }

        return arr3.get(k - 1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(2); arr1.add(3); arr1.add(6); arr1.add(7); arr1.add(9);

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(1); arr2.add(4); arr2.add(8); arr2.add(10);
            
        System.out.println("The k-th element of two sorted arrays is: " +
        kthElement(arr1, arr2, arr1.size(), arr2.size(), 5));
    }
}
