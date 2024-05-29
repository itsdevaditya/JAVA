package Shorting;

public class selection_sort {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // sorting using selection sort

        int[] arr = { 4, 2, 5, 27, 1 };
        System.out.println("unsorted array : ");
        printArray(arr);
        for (int i = 0; i < (arr.length - 1); i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
                int tem = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = tem;
            }
        }
        System.out.println("sorted array by using selection sort  : ");
        printArray(arr);
    }

}
