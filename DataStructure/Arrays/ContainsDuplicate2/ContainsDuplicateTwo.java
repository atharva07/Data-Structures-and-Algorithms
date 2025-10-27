package DataStructure.Arrays.ContainsDuplicate2;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateTwo {
    
    public boolean containsNearByDuplicate(int[] nums, int k) {
        Map<Integer, Integer> lastseen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (lastseen.containsKey(num) && (i - lastseen.get(num)) <= k) {
                return true;
            }

            lastseen.put(num, i);
        }

        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,4,3};
        int k = 3;
        ContainsDuplicateTwo obj = new ContainsDuplicateTwo();
        boolean result = obj.containsNearByDuplicate(arr, k);
        System.out.println("The result is " + result);
    }
}
