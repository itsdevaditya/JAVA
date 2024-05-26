package Shorting;

public class bubble_Short {
    public static void printArray(int arry[]) {
        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arry = { 5, 2, 8, 1, 34 };
        for (int i = 0; i < arry.length - 1; i++) {
            for (int j = 0; j < (arry.length - i - 1); j++) {
                if (arry[j] > arry[j + 1]) {
                    int tem = arry[j];
                    arry[j] = arry[j + 1];
                    arry[j + 1] = tem;

                }
            }
        }

        printArray(arry);
    }
}
