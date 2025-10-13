package DataStructure.Arrays;

public class SecondLargestElement {
    
    static int secondLargestEle(int[] arr) {
        int largest = arr[0];
        int slargest = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                slargest = largest;
                largest = arr[i]; 
            } else if (arr[i] < largest && arr[i] > slargest) {
                slargest = arr[i];
            }
        }

        return slargest;
    }

    public static void main(String[] args) {
        
        int[] arr = {4,3,5,6,7,8};
        int[] arr1 = {10,20,4,45,99};
        int res = secondLargestEle(arr);
        int res1 = secondLargestEle(arr1);

        System.out.println("Second Largest Element = " + res);
        System.out.println("Second Largest Element = " + res1);
    }
}
