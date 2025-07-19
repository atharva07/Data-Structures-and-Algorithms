package DataStructure.Arrays.SubArraysWithXORk;

public class SubarrayWithXORKBrute {
    
    public static int countSubArraysWithXOR(int[] arr, int K) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int currentXOR = 0;
                for (int k = i; k <= j; k++) {
                    currentXOR ^= arr[k];
                }
                if (currentXOR == K) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4};
        int k = 6;
        int res = countSubArraysWithXOR(arr, k);
        System.out.println("Count of Subarrays with XOR K = " + res);
    } 
}
