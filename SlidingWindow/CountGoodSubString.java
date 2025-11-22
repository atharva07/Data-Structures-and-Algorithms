package SlidingWindow;

public class CountGoodSubString {
    
    public static int countGoodSubString(String str) {
        int n = str.length();
        int count = 0;

        for (int i = 0; i <= n - 3; i++) {
            char a = str.charAt(i);
            char b = str.charAt(i+1);
            char c = str.charAt(i+2);

            if (a != b && a != c && b != c) {
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
