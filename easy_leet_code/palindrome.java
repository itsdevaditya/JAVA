package easy_leet_code;

import java.util.Scanner;

public class palindrome {
    public  static boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        boolean check = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt((str.length()-1) - i)) {
                check = true;
            } else
            
                return false;
        }
       
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any integer : ");
        int x = sc.nextInt();
        boolean result = isPalindrome(x);
         System.out.println(result);

    }
}
