package SlidingWindow;

public class KConsecutiveBlackBlocks {
    
    public static int minimumRecolors(String block, int k) {
        
        int n = block.length();
        int minOperation = Integer.MAX_VALUE;

        // looping range till substring
        for (int i = 0; i <= n - k; i++) {
            int count = 0;
            String window = block.substring(i, i+k);
            
            for (char ele : window.toCharArray()) {
                if (ele == 'W') {
                    count++;
                }
            }
            minOperation = Math.min(minOperation, count);
        }

        return minOperation;
    }

    public static void main(String[] args) {
        String block = "WBWBBBW";
        int k = 2;
        int res = minimumRecolors(block, k);
        System.out.println("Total count = " + res);
    }
}
