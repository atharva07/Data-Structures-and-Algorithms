package DataStructure.Arrays.ContainsDuplicate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContainsDuplicateTow {

    // In this method we are returning elements which are duplicate
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer, Integer> freqmap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int ele : nums) {
            freqmap.put(ele, freqmap.getOrDefault(ele, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : freqmap.entrySet()) {
            if (entry.getValue() > 1) {
                result.add(Math.toIntExact(entry.getKey()));
            }
        }

        if (result.size() == 1){
            return result;
        }

        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,4,1};
        ContainsDuplicateOne obj = new ContainsDuplicateOne();
        boolean result = obj.containsDuplicate(arr);
        System.out.println("The result is " + result);
    }
}
