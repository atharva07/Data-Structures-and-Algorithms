package PrefixSum;

public class PrefixSum {
    
    public static void main(String[] args) {
        
        int[] arr = {3,1,2,5,4};
        int n = arr.length;

        // Compute the prefix sum
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }

        // Query: Sum from L=1 to R=3 (0-based index)
        int L = 1, R = 3;
        int sum = prefixSum[R] - (L > 0 ? prefixSum[L -1] : 0);
        System.out.println("Sum from " + L + " to " + R + " is: " + sum);
    }
}
