import java.util.Scanner;

public class factorial {
    public static int Factorial(int n) {

        int fac = 1;
        for (int i = n; i > 0; i--) {
            fac *= i;
        }
        return fac;
    }

    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println(" Please Enter possitive number");
        } else
            System.out.println("Factorial of " + n + " is :" + Factorial(n));

    }

}





