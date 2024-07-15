// 
import java.util.*;

class qu {

    static class Queue {
        int arr[];
        int size;
        int rear;

        Queue(int size) {
            arr = new int[size];
            this.size = size;
            rear = -1;
        }

        public boolean isempty() {
            return rear == -1;
        }

        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            arr[++rear] = data;
        }

        public int dequeue() {
            if (isempty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        public int peek() {
            if (isempty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String args[]) {
        Queue q = new Queue(5); // Initialize with a size
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isempty()) {
            System.out.println(q.peek());
            q.dequeue();
        }
    }
}
