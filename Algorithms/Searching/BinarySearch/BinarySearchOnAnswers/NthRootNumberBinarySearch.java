package Algorithms.Searching.BinarySearch.BinarySearchOnAnswers;

public class NthRootNumberBinarySearch {
    
    // Find the Nth root of a number using binary search
    static int nthRootNumber(int n, int m) {
        int low = 1;
        int high = m;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (Math.pow(mid, n) == m) {
                return mid;
            } else if (Math.pow(mid, n) < m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 27;
        int res = nthRootNumber(n, m);
        System.out.println(res);
    }
}