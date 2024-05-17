import java.util.*;

public class Sumtwonumber {
    public static int SumTwoNumber(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = SumTwoNumber(a, b);
        System.out.println("sum of given numbers is " + sum);
    }
}
