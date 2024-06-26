package collection_framework;
import java.util.*;
public class stack_collection_framework {
    public static void main(String[] args) {
    
    Stack<Integer> list = new Stack<>();
    list.push(1);
    list.push(2);
    list.push(3);
    list.push(4);
     
    while (!list.isEmpty()) {
        System.out.println(list.peek());
        list.pop();
        
    }

}
}