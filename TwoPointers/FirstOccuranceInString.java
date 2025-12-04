package TwoPointers;

public class FirstOccuranceInString {
    
    public static int strStr(String heystack, String needle) {
        if (needle.isEmpty()) return 0;

        int m = heystack.length();
        int n = needle.length();

        for (int i = 0; i <= m - n; i++) {
            if (heystack.charAt(i) == needle.charAt(0)) {
                int j = 0; 
                while (j < n && heystack.charAt(i + j) == needle.charAt(j)) {
                    j++;
                }
                if (j == n) {
                    return i;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String heystack = "sadbutsad";
        String needle = "sad";

        int res = strStr(heystack, needle);
        System.out.println("First Occurance = " + res);
    }
}