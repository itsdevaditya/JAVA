package collection_framework;

public class LinkList {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // add first
    public void addFirst(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void addlast(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newnode;
    }

    // print linklist
    public void printlinklist() {
        if (head == null) {
            System.out.println("list is empty");
            return;

        }
        Node currnode = head;
        while (currnode != null) {
            System.out.print(currnode.data + " --> ");
            currnode = currnode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.addFirst("linklist");
        list.addFirst("is");
        list.addFirst("this");
        list.addlast("list");
        list.addFirst("link");
        list.printlinklist();

    }
}
