package SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class MinimumPositiveSumSubArray {
    
    public static int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int p1 = 0;
        int lp2 = l - 1;
        int rp2 = r - 1;
        int lminSum = Integer.MAX_VALUE;
        int rminSum = Integer.MAX_VALUE;

        while (lp2 <= n) {
            int lsum = nums.get(p1) + nums.get(lp2);
            p1 = p1 + l;
            lp2 = lp2 + l;
            lminSum = Math.min(rminSum, lsum);
        }

        while (rp2 <= n) {
            int rsum = nums.get(p1) + nums.get(rp2);
            p1 = p1 + r;
            rp2 = rp2 + r;
            rminSum = Math.min(rminSum, rsum);
        }

        return Math.min(lminSum, rminSum);
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(-2);
        nums.add(1);
        nums.add(4);

        int res = minimumSumSubarray(nums, 2, 3);
        System.out.println("res : " + res);
    }
}
