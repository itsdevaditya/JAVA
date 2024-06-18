package collection_framework;

import java.util.*;

public class linklist_frame2 {
    public static void main(String[] args) {
        @SuppressWarnings({ "unchecked", "rawtypes" })
        LinkedList<Integer> list = new LinkedList();
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 number in the range of 1 to 50  ");
        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            if (n < 1 || n > 50) {
                System.out.println("Please enter in the range of 1 to 50 : ");
                i--;
            } else {
                list.add(n);
            }
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 25) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}
