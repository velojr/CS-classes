/*
 * Lab: Chapter 6 Lab
 * Method Practice
 * Juan Segura Rico
 * 921725126
 * CSC 211-02
 * Fall 2021
 */

public class MethodPractice {
    public static void main(String[] args) {

        bartSimpsonChalk();


        double a = multiplyDoubles(10.4, 20.0);
        double b = multiplyDoubles(12.3, 5.34);
        double c = multiplyDoubles(a, b);

        System.out.println("The value of c is: " + c);



        printOperations(10, 20);
        printOperations(25, 4);

    }


    static void bartSimpsonChalk() {
        int z = 23;

        for (int i = 23; i > 1; i--)
            System.out.println("I will not bury the new kid.");

    }


    static double multiplyDoubles(double x, double y) {

        return x * y;

    }


    static void printOperations(int a, int b) {

        // Multiply part 1
        System.out.println("Product of " + a + " and " + b + " is " + (a * b));
        // Add part 1
        System.out.println("Sum of " + a + " and " + b + " is " + (a + b));
        // Subtract part 1
        System.out.println("Difference of " + a + " and " + b + " is " + (a - b));
        // Divide part 1
        System.out.println("Quotient of " + a + " and " + b + " is " + (a / b));
    }
}



