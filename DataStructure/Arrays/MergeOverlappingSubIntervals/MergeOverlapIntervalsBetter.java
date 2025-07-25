package DataStructure.Arrays.MergeOverlappingSubIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlapIntervalsBetter {
    
    public static int[][] mergeBetterSol(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }

        // sort the intervals by start time
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        int[] current = intervals[0];
        merged.add(current);

        for (int[] next : intervals) {
            if (current[1] >= next[0]) {
                current[1] = Math.max(current[1], next[1]);
            } else {
                current = next;
                merged.add(current);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result = mergeBetterSol(intervals);
        System.out.println(Arrays.deepToString(result));
    }
}
