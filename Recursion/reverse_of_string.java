package Recursion;

import java.util.Scanner;

public class reverse_of_string {
    public static void print_reverse(String name, int len) {
        if (len == -1) {
            return;
        }
        System.out.print(name.charAt(len));
        print_reverse(name, len - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = sc.nextLine();
        int len = name.length();
        System.out.println("Reverse of your String ");
        print_reverse(name, len - 1);

    }

}



