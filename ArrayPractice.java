/*
 * Chapter 7 Lab
 * Array Practice
 * Juan Segura Rico
 * 921725126
 * CSC 211-02
 * Fall 2021
 */

public class ArrayPractice {
    public static void main(String[] args) {

        int[] scores = new int[100];
        int index;

        for (index = 0; index < scores.length; index++)
        {
            scores[index] = (int) (Math.random() * 100);
            scores[2] = 50;
        }
        System.out.println("Employee " + index + " scored " + scores[2]);
        System.out.println(scores.length);

        int sum = 0;
        double average = 0;

        for (int i = 0; i < scores.length; i++)
        {
            sum += scores[i];
            average = sum / scores.length;
        }

        System.out.println("The average score is: " + average);
        
    }}
