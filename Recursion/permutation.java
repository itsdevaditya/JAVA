package Recursion;

import java.util.Scanner;

public class permutation {
    public static void print_permutations(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;

        }
        for (int i = 0; i < str.length(); i++) {
            char currentchar = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i + 1);
            print_permutations(newstr, permutation + currentchar);

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String : ");
        String str = sc.nextLine();
        System.out.println("Permutation of " + str + " is : ");
        print_permutations(str, "");
    }

}
