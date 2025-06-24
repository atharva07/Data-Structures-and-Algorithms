package Recursion;

import java.util.Arrays;

public class ExpoTimeComplexity {
    
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        int n = 4;
        int[] fibseries = new int[n];
        for (int i = 0; i < n; i++) {
            fibseries[i] = fibonacci(i);
        }

        System.out.println("The First " + n + " Fibonacci number are: ");

        System.out.println(Arrays.toString(fibseries));
    }
}