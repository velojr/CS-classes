/*
 * Assignment 2
 * 3 Number Sort
 * Juan Segura Rico
 * 921725126
 * CSC 210-01
 * Fall 2021
 */

import java.util.Scanner;
public class ThreeNumSort {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Prompt user to enter integers here.
        System.out.println("Please enter the first integer: ");

        System.out.println("Please enter the second integer: ");

        System.out.println("Please enter the third integer: ");

        double a = reader.nextDouble();
        double b = reader.nextDouble();
        double c = reader.nextDouble();

        // Create if/else if statements to show possible order outcomes
        if (a >= b) {
            if (b >= c)
                System.out.println("These are the 3 numbers in order: " + c + " " + b + " " + a);
            else if (c >= a)
                System.out.println("These are the 3 numbers in order: " + b + " " + a + " " + c);
            else if (a > c)
                System.out.println("These are the 3 numbers in order: " + b + " " + c + " " + a);
        }

        if (b > a) {
            if (c >= b)
                System.out.println("These are the 3 numbers in order: " + a + " " + b + " " + c);
            else if (c >= a)
                System.out.println("These are the 3 numbers in order: " + a + " " + c + " " + b);
            else if (a > c)
                System.out.println("These are the 3 numbers in order: " + c + " " + a + " " + b);
        }
    }
}










