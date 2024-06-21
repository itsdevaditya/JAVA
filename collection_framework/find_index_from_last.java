package collection_framework;

import java.util.LinkedList;
import java.util.Scanner;

public class find_index_from_last {
    public static void main(String[] args) {
        @SuppressWarnings({ "rawtypes", "unchecked" })
        LinkedList<Integer> list = new LinkedList();

        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(3);
        System.out.println(list);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth number ");
        int n = sc.nextInt();

        list.size();
        int index = list.size() - n - 1;
        System.out.println("Index of " + n + "th element from last is " + index);

    }
}
