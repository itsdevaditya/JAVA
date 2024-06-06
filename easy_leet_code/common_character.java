package easy_leet_code;

import java.util.Scanner;

public class common_character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of String : ");
        int n = sc.nextInt();

        String words[] = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + i + " words : ");
            words[i] = sc.next();

        }
        for (int i = 0; i < n; i++) {
            System.out.print(words[i] + " ");
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0 ; j < words[i].length() ; j ++){
            if (words[i].charAt(j) == words[i+1].charAt(j)) {
                }
            }
        }
    }
}









