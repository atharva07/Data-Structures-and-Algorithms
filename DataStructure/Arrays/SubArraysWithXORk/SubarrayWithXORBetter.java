package DataStructure.Arrays.SubArraysWithXORk;

public class SubarrayWithXORBetter {
    
    public static int countSubArraysWithXOR(int[] arr, int k) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int currentXOR = 0;
            for (int j = i; j < n; j++) {
                currentXOR ^= arr[j];
                if (currentXOR == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {4,2,2,6,4};
        int k = 6;
        int res = countSubArraysWithXOR(arr, k);
        System.out.println("Count of Sub Arrays with XOR k = " + res);
    }
}
