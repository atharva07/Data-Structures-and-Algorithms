package DataStructure.Arrays.MissingNumberInArray;

public class MissingNumberInUnSortedArr {
    
    public static int missingNos(int[] arr) {
        int n = arr.length + 1;
        int[] hash = new int[n + 1];

        for (int i = 0; i < n - 1; i++) {
            hash[arr[i]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        int res = missingNos(arr);
        System.out.println(res);
    }
}
