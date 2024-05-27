package arrays;

import java.util.Scanner;

public class Array_2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int colms = sc.nextInt();
        int[][] numbers = new int[rows][colms];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colms; j++) {
                System.out.print("Enter ("+i + ", " +j+ ") : ");
                numbers[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colms; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }

}
