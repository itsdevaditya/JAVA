package arrays;

import java.util.Scanner;

public class TwoDArraySearch {
    public static void main(String[] args) {
        // Learn to create and show 2D Array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int colms = sc.nextInt();
        int[][] numbers = new int[rows][colms];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colms; j++) {
                System.out.print("Enter (" + i + ", " + j + ") : ");
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the number which you want to search : ");
        int x = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colms; j++) {
                if (numbers[i][j] == x) {
                    System.out.println("Index of " + x + " is : [" + i + "," + j + "]");

                }
            }
        }
    }
}




