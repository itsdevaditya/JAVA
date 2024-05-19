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
        
    }

}
