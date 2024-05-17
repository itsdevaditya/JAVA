import java.util.Scanner;

public class factorial {
    public static int Factorial(int n) {
        int fac = 1;
        for (int i = n; i > 0; i--){

        fac *=   i;}
        // if (n > 0) {S
        // fac = n * Factorial(n - 1);
        // }else if (n == 0) {
        // fac = 1;
        // } else
        // System.out.println("Please Enter possiive number");
        return fac;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is :" + Factorial(n));

    }

}
