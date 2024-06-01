package Shorting;

public class insertion_sort {
    public static void printArray(int arry[]) {
        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i] + " ");
        }

    }

    public static void main(String[] args) {
        // sorting using selection sort

        int[] arr = { 4, 2, 5, 27, 1 };
        System.out.println("unsorted array : ");
        printArray(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            // placement
            arr[j + 1] = current;

        }
        System.out.println();
        System.out.println("Shorted array by using insertion sort  ");
        printArray(arr);
    }
}
