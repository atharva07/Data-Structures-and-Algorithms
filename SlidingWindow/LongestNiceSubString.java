package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestNiceSubString {
    
    public static String niceSubString(String s) {
        int n = s.length();
        String result = "";

        for (int start = 0; start < n; start++) {
            Set<Character> upperSet = new HashSet<>();
            Set<Character> lowerSet = new HashSet<>();


            for (int end = start; end < n; end++) {
                char c = s.charAt(end);

                // Add a appropriate set
                if (Character.isUpperCase(c)) {
                    upperSet.add(c);
                } else {
                    lowerSet.add(c);
                }

                // check if current substring is nice
                if (isNice(upperSet, lowerSet)) {
                    String current = s.substring(start, end + 1);
                    if (current.length() > result.length()) {
                        result = current;
                    } else if (current.length() == result.length() && result.length() > 0) {
                        // For same length, pick the earliest occurrence
                        if (s.indexOf(current) < s.indexOf(result)) {
                            result = current;
                        }
                    }
                }
            }
        }

        return result;
    }

    private static boolean isNice(Set<Character> upperSet, Set<Character> lowerSet) {
        // Check if every uppercase letter has corresponding lowercase
        for (char upper : upperSet) {
            char lower = Character.toLowerCase(upper);
            if (!lowerSet.contains(lower)) {
                return false;
            }
        }
        
        // Check if every lowercase letter has corresponding uppercase
        for (char lower : lowerSet) {
            char upper = Character.toUpperCase(lower);
            if (!upperSet.contains(upper)) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        String s = "YazaAay";
        String output = niceSubString(s);
        System.out.println("Result = " + output);
    }
}
