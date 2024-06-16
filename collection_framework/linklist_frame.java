package collection_framework;
import java.util.*;
import java.util.Scanner;

public class linklist_frame {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList();
        // first problem
        
        // LinkedList<>();
        // list.add(1);
        // list.add(5);
        // list.add(7);
        // list.add(3);
        // list.add(8);
        // list.add(2);
        // list.add(3);
        // System.out.println(list);
        // for(int i = 0 ; i < list.size() ; i++){
        //     if (list.get(i) == 7) {
        //         System.out.println("Index of 7 is : " + i );
        //         return;
      

        // second problem
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 number in the range of 1 to 50  ");
        for(int i = 0 ; i < 10 ;i ++ ){
            int n = sc.nextInt();
            if(n < 1 || n > 50 ){
                System.out.println("Please enter in the range of 1 to 50 : ");
                i--;
            }
            else {
                list.add(n);
            }
        }
        System.out.println(list);
        for(int i = 0 ; i < list.size() ; i ++){
            if(list.get(i)> 25){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
    
}

