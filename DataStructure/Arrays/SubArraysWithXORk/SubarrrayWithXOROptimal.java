package DataStructure.Arrays.SubArraysWithXORk;

import java.util.HashMap;

public class SubarrrayWithXOROptimal {
    
    public static int countSubArraysWithXOR(int[] arr, int K) {
        HashMap<Integer, Integer> prefixXOR = new HashMap<>();
        prefixXOR.put(0, 1); // Base case : XOR 0 occurs once
        int currentXOR = 0;
        int count = 0;

        for (int num : arr) {
            currentXOR ^= num;
            // If (currentXOR ^ K) exists in the map, add its frequency to count
            count += prefixXOR.getOrDefault(currentXOR ^ K, 0);
            // Update the frequency of currentXOR
            prefixXOR.put(currentXOR, prefixXOR.getOrDefault(currentXOR, 0) + 1);
        }
        return count;
    }
}