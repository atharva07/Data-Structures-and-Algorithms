package DataStructure.Arrays;

public class PascalTriangle {
    
    public static void printPascelTriangle(int numRows) {
        for (int i = 0; i < numRows; i++) {
            // Print leading spaces for alignment
            for (int j = 0; j < numRows - i - 1; j++) {
                System.out.println(" ");
            }

            // calculate and print numbers
            int number = 1;
            for (int k = 0; k <= i; k++) {
                System.out.printf("%4d", number);
                number = number * (i - k) / (k + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numRows = 5;
        printPascelTriangle(numRows);
    }
}