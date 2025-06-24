package DataStructure.Arrays;

import java.util.Arrays;

public class LargestElementArray {

    static int sort(int arr[]) {
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public static void main(String[] args) {
        int arr1[] = {2,5,1,3,0};
        System.out.println("The Largest element in the array is: " + sort(arr1));
    }
}