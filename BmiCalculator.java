/*
* Lab: 2
* Description: BMI Calculator
* Name: Juan Segura Rico
* ID #: 921725126
* Class: CSC 211-02
* Semester: Fall 2021
*/

import java.util.Scanner;
public class BmiCalculator {
    public static void main(String[] args){
        Scanner BmiCalculator = new Scanner(System.in);
        double height = 1.75;
        int castedBMI;

        castedBMI = (int)height;

    // Begin entering your height and weight in kg and m.

    System.out.println("Input weight in kilograms: 79 ");
    int weight = (79);
    System.out.println("\nInput height in meters: 1.75 ");
    double BMI = weight / (height * height);
    System.out.println("\nThe BMI is " + BMI );

    // The "\n" helps space out what was entered from everything else.
    // "int" is used for weight, and "double" for height.
    }
}