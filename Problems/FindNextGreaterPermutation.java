package Problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindNextGreaterPermutation {
    
    public static List<Integer> nextGeraterPermutation(List<Integer> arr) {
        int n = arr.size(); // size of Array

        // step 1: Find the break point
        int ind = -1; // break point
        for (int i = n - 2; i >= 0; i--) {
            if (arr.get(i) < arr.get(i + 1)) {
                // ind i is the break point
                ind = i;
                break;
            }
        }

        // if break point does not exist
        if (ind == -1) {
            Collections.reverse(arr);
            return arr;
        }

        // step 2: find the next greater element
        // and swap it with arr[ind]
        for (int i = n - 1; i > ind; i--) {
            if (arr.get(i) > arr.get(ind)) {
                int temp = arr.get(i);
                arr.set(i, arr.get(ind));
                arr.set(ind, temp);
                break;
            }
        }

        // step 3: Reverse the right half
        List<Integer> sublist = arr.subList(ind + 1, n);
        Collections.reverse(sublist);

        return arr;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(new Integer[] {2,1,5,4,3,0,0});
        List<Integer> ans = nextGeraterPermutation(arr);

        System.out.println("The next permutation is: [");
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i) + " ");
        }
        System.out.println("]");
    }
}
