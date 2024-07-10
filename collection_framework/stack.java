package collection_framework;
public class stack {
    static Node head;
    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static class stacknum {
        public static boolean isempty() {

            return head == null;
        }
        public void push(int data) {
            Node newnode = new Node(data);
            if (isempty()) {
                head = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
        }
        public int pop() {
            if (isempty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public int peek() {
            if (isempty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        stacknum s = new stacknum();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!stacknum.isempty()) {
            System.out.println(s.peek());
            s.pop();

        }
    }

}
