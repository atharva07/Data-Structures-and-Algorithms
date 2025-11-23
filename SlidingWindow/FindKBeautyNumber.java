package SlidingWindow;

public class FindKBeautyNumber {
    
    public static int divisorSubString(int num, int k) {
        String numStr = String.valueOf(num);
        int count = 0;
        int n = numStr.length();

        // Sliding window will check every subString on length k
        // We are using [i+k] because we want to access everything upto Kth element
        // for looping range we are using n - k since we want to subString till k
        for (int i = 0; i <= n - k; i++) {
            String subString = numStr.substring(i, i+k);
            int divisor = Integer.parseInt(subString);
            System.out.println("Divisor : " + divisor);

            if (divisor != 0 && num % divisor == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int num = 240;
        int k = 2;
        int res = divisorSubString(num, k);
        System.out.println("Total count = " + res);
    }
}