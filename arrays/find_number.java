package arrays;

import java.util.Scanner;

public class find_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Array : ");
        int n = sc.nextInt();

        int number[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + i + " number : ");
            number[i] = sc.nextInt();
        }
        for (int i = 0; i <= n; i++) {
            int x = 4;
            if (number[i] == x) {
                System.out.println(x + " found at index " + i);

            }
        }
    }
}
