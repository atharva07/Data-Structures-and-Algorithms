package DataStructure.Arrays.MergeOverlappingSubIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlapIntervalsBrute {
    
    public static int[][] mergeBruteForce(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }

        List<int[]> merged = new ArrayList<>();
        boolean[] mergedFlags = new boolean[intervals.length];

        for (int i = 0; i < intervals.length; i++) {
            if (mergedFlags[i]) continue;
            int[] current = intervals[i];
            for (int j = i + 1; j < intervals.length; j++) {
                if (mergedFlags[j]) continue;
                int[] next = intervals[j];
                // check for overlap
                if (current[1] >= next[0] && current[0] <= next[1]) {
                    current[0] = Math.min(current[0], next[0]);
                    current[1] = Math.max(current[1], next[1]);
                    mergedFlags[j] = true;
                }
            }
            merged.add(current);
        }
        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result = mergeBruteForce(intervals);
        System.out.println(Arrays.deepToString(result));
    }
}
