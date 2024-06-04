package Recursion;

import java.util.Scanner;

public class print_number {
    public static void print_num(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        print_num(n - 1);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        System.out.println("print number in reverse order by using recursion ");
        print_num(n);
    }
}





