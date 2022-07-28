/*
 * Chapter 5 Lab
 * Sum of Harmonic Series
 * Juan Segura Rico
 * 921725126
 * CSC 211-02
 * Fall 2021
 */

    public class Harmonic {
        public static void main(String[] args) {

            // Our variables, sums, and numbers in the series
            int n = 50;
            double sum = 0;
            int a = 1;

                // for loop

                for (double i = 1; i <= n; i++)
                {
                    sum += 1 / i;
                }
                System.out.println(sum);
                System.out.println("End of for loop.");

                // while loop
            
                while (a <= 50)
                {
                    sum += 1/1/n;
                    a++;
                }
                System.out.println(sum);
                System.out.println("End of while loop.");
            }
        }
