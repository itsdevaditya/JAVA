package Recursion;
import java.util.Scanner;
import Learn_String.reverse_string;
public class first_and_last_index {
   public static int first = -1;
   public static int last = -1;
   public static void first_last_index(String str, int indx, char element) {
      if (indx == str.length() - 1) {
         System.out.println("Tirst index of element is : " + first);
         System.out.println("last index of element is : " + last);
         return;
      }
      if (str.charAt(indx) == element) {
         if (first == -1) {
            first = indx;
         } else {
            last = indx;
         }
      }
      first_last_index(str, indx + 1, element);
   }
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your String ");
      String str = sc.nextLine();
      int len = 0;
      System.out.print("Enter the charcter for finding its first and last index : ");
      char element = sc.next().charAt(0);
      first_last_index(str, len, element);
   }
}
