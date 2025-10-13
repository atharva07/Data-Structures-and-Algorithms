package DataStructure.Arrays.LeftRotateArrayByOnePlace;

public class LeftRotateArrByOnePlaceBrute {
    
    public static void rotateArrayByOne(int[] arr, int n) {
        int temp[] = new int[n];
        for (int i = 1; i < n; i++) {
            temp[i - 1] = arr[i];
        }
        temp[n-1] = arr[0];

        for (int i = 0; i < n; i++) {
            System.out.println(temp[i]+" ");
        }
    }

    public static void main(String[] args) {
        int n=5;
        int arr[]= {1,2,3,4,5};
        rotateArrayByOne(arr, n);
    }
}
