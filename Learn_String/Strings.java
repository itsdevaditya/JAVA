package Learn_String;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first_name = sc.nextLine();
        String last_name = sc.nextLine();
        // concatenation == +
        System.out.println("Your namer is : " + first_name + " " + last_name);
        // Length function
        System.out.println((first_name + " " + last_name).length());
        // charAt
        for (int i = 0; i < first_name.length(); i++) {
            System.out.println(first_name.charAt(i));
        }
        // String1.compareTo(String2)
        // if s1 < s2 = +ve
        // if s1 == s2 = 0
        // if s1 - s2 = -ve

        if (first_name.compareTo(last_name) == 0) {
            System.out.println("First name and last name is equal ");

        } else {
            System.out.println("First name and last name are not equal ");
        }
        // substring function
        // Stings are Immuatable -- We can not change or modify any string 
        System.out.println(first_name.substring(3));
    }

}
