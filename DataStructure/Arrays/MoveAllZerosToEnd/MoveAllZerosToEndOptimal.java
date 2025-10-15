package DataStructure.Arrays.MoveAllZerosToEnd;

public class MoveAllZerosToEndOptimal {
    // this is a two pointer approach
    public static int[] moveZerosToEnd(int[] arr, int n) {
        int j = -1;
        for (int i = 0; i < n; i++) { // --- O(N)
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1) return arr;

        for (int i = j + 1; i < n; i++) { // --- O(N)
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }

    // Time complexity - O(N) - we are using 2 loops but, we are traversing the array once
    // space complexity - O(1)

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = 10;
        int[] ans = moveZerosToEnd(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");
    }
}
