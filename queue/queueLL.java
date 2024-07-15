class queueLL {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class Queue {
        Node head;
        Node tail;

        public boolean isEmpty() {
            return head == null && tail == null;
        }

        public void add(int data) {
            Node newNode = new Node(data);
            if (tail == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public int delete() {
            if (isEmpty()) {
                System.out.println("The Queue is Empty");
                return -1;
            }
            int front = head.data;
            if (head == tail) {
                tail = null;
            }
            head = head.next;
            return front;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("The Queue is Empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String args[]) {
        queueLL ql = new queueLL();
        Queue q = ql.new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(" " + q.peek());
            System.out.println("The removed element is " + q.delete());
        }
    }
}
