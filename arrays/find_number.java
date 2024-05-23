package arrays;

import java.util.Scanner;

public class find_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int number[] = new int[n];
        for (int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
        }
        for (int i = 0; i <= n; i++) {
            int x = 4;
            if (number[i] == x) {
                System.out.println(x + " found at index " +i);

            } 
            // else
            //     System.out.println(x + " is not present in this array");
        }
    }
}
