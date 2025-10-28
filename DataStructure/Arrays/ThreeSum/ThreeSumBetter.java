package DataStructure.Arrays.ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSumBetter {

    public static List<List<Integer>> threeSum(int[] arr) {
        Set<List<Integer>> st = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            Set<Integer> hashset = new HashSet<>();
            for (int j = i + 1; j < arr.length; j++) {
                int third = -(arr[i] + arr[j]);

                if (hashset.contains(third)) {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
                    temp.sort(null);
                    st.add(temp); 
                }
                hashset.add(arr[j]);
            }
        }

        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }

    // time complexity - O(N^2)

    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4};
        List<List<Integer>> ans = threeSum(arr);
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }
}