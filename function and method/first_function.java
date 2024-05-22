// package function and method;
import java.util.*;
public class first_function {
    public static void PrintMyName(String name) {
        System.out.println("Your name is : " + name);
        return;
    }

    public static void main(String args[]) {
        System.out.print("Enter your Name : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        PrintMyName(name);
    }
}








