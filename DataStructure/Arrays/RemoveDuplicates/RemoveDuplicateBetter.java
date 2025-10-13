package DataStructure.Arrays.RemoveDuplicates;

import java.util.HashSet;

public class RemoveDuplicateBetter {
    
    public static int removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int uniqueIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);

                arr[uniqueIndex] = arr[i];
                uniqueIndex++;
            }
        }
        return uniqueIndex;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,3,3,5,5,7};
        int newlength = removeDuplicates(arr);
        
        for (int i = 0; i < newlength; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
