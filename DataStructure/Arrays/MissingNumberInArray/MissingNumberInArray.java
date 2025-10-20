package DataStructure.Arrays.MissingNumberInArray;

public class MissingNumberInArray {
    
    public int missingNumber(int[] arr) {
        int n = arr.length;

        int sum = n * (n + 1) / 2;
        int s2 = 0;
        for (int i = 0; i < n-1; i++) {
            s2 = s2 + arr[i];
        }

        int missing = sum - s2;
        return missing;
    }

    // Time complexity - O(N)

    public static void main(String[] args) {
        int arr[] = {1,2,4,5};
        MissingNumberInArray obj = new MissingNumberInArray();
        int result = obj.missingNumber(arr);
        System.out.println("The missing number is " + result);
    }
}