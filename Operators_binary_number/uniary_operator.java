package Operators_binary_number;

public class uniary_operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        // post increment
        b = a++;
        System.out.println(a);
        System.out.println(b);
        // pre increment
        b = ++a;
        System.out.println(a);
        System.out.println(b);
    }

}
