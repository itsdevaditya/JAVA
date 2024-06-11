package Recursion;
import java.util.Scanner;
public class check_sorting {
    public static boolean a;
    public static void check_sort(int arr[], int indx) {
        if (indx == arr.length - 1) {
            System.out.println("Given  array is  sorted ");
            return;
        }
        if (arr[indx] < arr[indx + 1]) {
            a = true;
        } else {
            System.out.println("Given  array is not sorted ");
            return;
        }
        check_sort(arr, indx + 1);
    }
    public static void main(String[] args) {
        System.out.print("Enter the length of array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + i + " element of array : ");
            arr[i] = sc.nextInt();
        }
        check_sort(arr, 0);
    }
}



