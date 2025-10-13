package DataStructure.Arrays.RotateArrayByKPlaces;

// using temp
public class RotateArrayByKPlace {
    static void rotateArray(int[] arr, int n, int d) {
        d = d % n;

        int temp[] = new int[d];
        // copy all items to temp till length d
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        // copy the items from length d to last in arr
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        // copy remaining items in arr 
        for (int i = n - d; i < n; i++) {
            arr[i] = temp[i - (n -d)];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        int d = 3;

        rotateArray(arr, n, d);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
