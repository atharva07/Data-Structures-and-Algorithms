package DataStructure.Arrays.MoveAllZerosToEnd;

import java.util.ArrayList;

public class MoveAllZerosToEndBrute {
    
    static void moveZerosToEnd(int[] arr, int n) {
        ArrayList<Integer> temp = new ArrayList<>();

        // step 1 - move non zero element to temp
        for (int i = 0; i < n; i++) {   // --- O(N)
            if (arr[i] != 0) {
                temp.add(arr[i]);
            }
        }

        // step 2 - replace arr elements with temp element
        for (int i = 0; i < temp.size(); i++) { // --- O(X)
            arr[i] = temp.get(i);
        }

        int nz = temp.size();

        // step 3 - add zeros to end
        for (int i = nz; i < n; i++) { // --- O(N - X)
            arr[i] = 0;
        }
    }

    // Time Complexity - O(N) + O(X) + O(N-X) => O(2N)
    // Space Complexity - O(N)

    public static void main(String[] main) {
        int[] arr = {1,2,0,3,0,4,0,0,5,6};
        int n = arr.length;

        moveZerosToEnd(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
