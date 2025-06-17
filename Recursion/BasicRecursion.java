package Recursion;

public class BasicRecursion {
    
    void print() {
        System.out.println("Hello");
        print();
    }

    public static void main(String[] args) {
        BasicRecursion obj1 = new BasicRecursion();
        obj1.print();
    }
}
