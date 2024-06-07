package Recursion;

import java.util.Scanner;

public class shift_element {
    public static int count = 0;

    public static void shift_char(String str, int indx, char element) {
        if (indx == str.length()) {
            for (int i = 0; i < count; i++) {
                System.out.print(element);
            }
            return;

        }
        if (str.charAt(indx) == element) {
            count++;
        } else {
            System.out.print(str.charAt(indx));
        }
        shift_char(str, indx + 1, element);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String ");
        String str = sc.nextLine();
        int len = 0;
        System.out.print("Enter the charcter which you want to shift : ");
        char element = sc.next().charAt(0);
        shift_char(str, len, element);
    }

}
