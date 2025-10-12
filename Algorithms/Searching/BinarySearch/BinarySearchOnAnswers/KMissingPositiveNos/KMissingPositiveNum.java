package Algorithms.Searching.BinarySearch.BinarySearchOnAnswers.KMissingPositiveNos;

public class KMissingPositiveNum {
    
    public static int missingK(int[] vec, int n, int k) {
        for (int i = 0; i < n; i++) {
            if (vec[i] <= k) {
                k++;
            } else {
                break;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] vec = {4, 7, 9, 10};
        int n = 4, k = 1;
        int ans = missingK(vec, n, k);
        System.out.println("The missing number is: " + ans);
    }
}
