package Shorting;

public class selection_sort {

    public static void printArray(int arr[]){
        for (int i = 0 ; i< arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
       

        int []arr = {4,2,5,27,1};
        for (int i = 0 ; i < arr.length ; i++){
            for(int j = i+1; j < arr.length ; j++ ){
                int smallest = i;
                if (arr[j]< smallest) {
                    smallest = j;
                }
                int tem = arr[i];
                arr[i] = arr[j];
                arr[j] = tem;
            }
        }
        printArray( arr);
    }

}
