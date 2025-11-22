package SlidingWindow;

public class CountGoodSubStringBetter {
    
    private static boolean hasUniqueCharacters(String s, int start, int end) {
        return s.charAt(start) != s.charAt(start+1) &&
            s.charAt(start) != s.charAt(start+2) &&
            s.charAt(start+1) != s.charAt(start + 2);
    }

    public static int countGoodSubString(String s) {
        int count = 0;

        for (int i = 0; i <= s.length() - 3; i++) {
            int j = i + 2;

            if (hasUniqueCharacters(s, i, j)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "xyzzaz";
        int res = countGoodSubString(str);
        System.out.println("Total Count = " + res); 
    }
}
