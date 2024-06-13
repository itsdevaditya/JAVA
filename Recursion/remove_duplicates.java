package Recursion;

import java.util.Scanner;

public class remove_duplicates {
    public static boolean[] map = new boolean[26];

    public static void Remove_Duplicates(String str, int indx, String newString) {
        if (indx == str.length()) {
            System.out.println(newString);
            return;

        }
        char currentchar = str.charAt(indx);

        if (map[currentchar - 'a'] == true) {
            Remove_Duplicates(str, indx + 1, newString);
        } else {
            newString += currentchar;
            map[currentchar - 'a'] = true;
            Remove_Duplicates(str, indx + 1, newString);

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String ");
        String str = sc.nextLine();
        System.out.println("Your string after removing duplicates ");
        Remove_Duplicates(str, 0, "");
        // System.out.print("Enter the charcter which you want to shift : ");
        // char element = sc.next().charAt(0);

    }
}



