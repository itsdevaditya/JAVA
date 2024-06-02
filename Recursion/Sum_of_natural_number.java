package Recursion;

import java.util.Scanner;

public class Sum_of_natural_number {

    public static int sum_numb(int n, int sum) {

        if (n == 0) {
            sum += n;
            System.out.println(sum);
            return 0;

        }
        sum += n;
        sum_numb(n - 1, sum);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        System.out.print("Sum of natural number til " + n + " is : ");
        sum_numb(n, 0);
        // System.out.println(sum_numb(n , 0));
    }
}
