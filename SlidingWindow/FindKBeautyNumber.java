package SlidingWindow;

public class FindKBeautyNumber {
    
    public static int divisorSubString(int num, int k) {
        String numStr = String.valueOf(num);
        int count = 0;
        int n = numStr.length();

        // Sliding window will check every subString on length k
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
}