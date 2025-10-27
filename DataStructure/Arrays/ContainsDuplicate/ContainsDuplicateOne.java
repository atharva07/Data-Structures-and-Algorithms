package DataStructure.Arrays.ContainsDuplicate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContainsDuplicateOne {
    
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
        }

        for (Map.Entry<Integer, Integer> entry: freqMap.entrySet()) {
            if (entry.getValue() > 1) {
                result.add(Math.toIntExact(entry.getKey()));
            }
        }

        if (result.size() >= 1) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,4,1};
        ContainsDuplicateOne obj = new ContainsDuplicateOne();
        boolean result = obj.containsDuplicate(arr);
        System.out.println("The result is " + result);
    }
}
