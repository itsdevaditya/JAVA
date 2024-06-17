package collection_framework;
import java.util.*;

public class reverselinkllist {
    Node head;
    class Node {
        String data ;
        Node next;

    }
        public void revrlinklist(){
            if(head == null || head.next == null ){
                return;
                
            }
            Node previousNode = head;
            Node currNode = previousNode.next;

            while(currNode != null){
                Node nextNode = currNode.next;
                currNode.next = previousNode;

                previousNode = currNode;
                currNode = nextNode;

            }
            head.next = null;
            head = previousNode;

        }
   

    public static void main(String [] args){
        LinkedList<Integer> list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        


    }
    
}
