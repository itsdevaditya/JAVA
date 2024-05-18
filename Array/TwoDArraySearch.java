package JAVA.Array;

import java.util.Scanner;

public class TwoDArraySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int colms = sc.nextInt();
        int[][] numbers = new int[rows][colms];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colms; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the number which you want to search : ");
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
