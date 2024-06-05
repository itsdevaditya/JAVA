package Recursion;

import java.util.Scanner;

public class print_XpowerN{
    public static int calculate_pow(int x , int n , int product){
        if (n == 0) {
            return 1;    
        }
        if (x == 0) {
            return 0; 
        }  
        product = x*calculate_pow(x, n-1, product);
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x : ");
        int x = sc.nextInt();
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println("Value  of X ^ N is : " + calculate_pow(x, n, 1));
    }
    
}
