package collection_framework;

public class queue_using_arr {
    static class Queue_arr{
        static int arr[];
        static int size;
        static int rear = -1;

        Queue_arr(int n) {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        // enqueue
        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("full queue");
            }

            rear++;
            arr[rear] = data;

        }

        public static int remove() {
            if (isEmpty()) {
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i <= rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;

        }

    }

    public static void main(String[] args) {
        Queue_arr q = new Queue_arr(4);
        q.add(3);
        q.add(2);
        q.add(1);
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }

}
