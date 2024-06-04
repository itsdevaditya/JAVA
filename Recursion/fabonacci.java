package Recursion;

import java.util.Scanner;

public class fabonacci {
    public static void fab(int a, int b, int n) {
        if (n == 0) {
            return;

        }
        int c = a + b;
        System.out.print(c + " ");
        fab(b, c, n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println("Fabonacci series of " + n + " numbers ");
        System.out.print(a + " ");
        System.out.print(b + " ");
        fab(a, b, n - 2);

    }
}
