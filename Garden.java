/*
 * Chapter 8 Lab
 * Garden
 * Juan Segura Rico
 * 921725126
 * CSC 211-02
 * Fall 2021
 */

import java.util.Arrays;
public class Garden {
    public static void main(String[] args) {

        int[][] garden = {
                {0, 0, 0, 1},
                {0, 1, 0, 0},
                {0, 0, 0, 1},

                {0, 1, 0, 1},
                {0, 1, 0, 0},
                {0, 0, 0, 1}
        };
        printGarden(garden);
        System.out.println("Flowers in Col 1: " + countFlowersColumn(garden,1));
        System.out.println("Flowers in Row 1: " + countFlowersRow(garden, 1));
    }

    public static void printGarden(int[][] garden) {
        for (int[] ints : garden) {
            for (int col = 0; col < ints.length; col++) {
                System.out.print(ints[col] + " ");
            }
            System.out.println();
        }
    }

    public static void addFlower(int[][] garden, int column, int row) {
        garden[row][column] = 1;
        printGarden(garden);
    }

    public static int countFlowersColumn(int[][] garden, int column) {
        return column;
    }

    public static int countFlowersRow(int [][] garden, int row) {
        return row;
    }


}
