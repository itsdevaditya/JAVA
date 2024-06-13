package Recursion;

import java.util.Scanner;

public class Subseqences {
    public static void print_subseqences(String str, int indx, String newString) {
        if (indx == str.length()) {
            System.out.println(newString);
            return; 
        }
        char currentchar = str.charAt(indx);

        // to be
        print_subseqences(str, indx + 1, newString + currentchar);

        // not to be
        print_subseqences(str, indx + 1, newString);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String : ");
        String str = sc.nextLine();
        System.out.println("Your Subseqences of " + str + " is : ");
        print_subseqences(str, 0, "");

    }

}




