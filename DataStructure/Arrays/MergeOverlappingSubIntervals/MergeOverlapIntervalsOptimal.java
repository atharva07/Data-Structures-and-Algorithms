package DataStructure.Arrays.MergeOverlappingSubIntervals;

import java.util.Arrays;
import java.util.LinkedList;

public class MergeOverlapIntervalsOptimal {
    
    public static int[][] mergeOptimal(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], a[0]));

        LinkedList<int[]> merged = new LinkedList<>();
        for (int[] interval : intervals) {
            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                merged.add(interval);
            } else {
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }
        
        return merged.toArray(new int[merged.size()][]);
    }
}