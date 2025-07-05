class LinkedStack {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    public static void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public static void display() {
        if (head == null) {
            System.out.println("No data in the stack");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null"); 
    }

    public static void main(String args[]) {
        LinkedStack st = new LinkedStack();
        st.add(5);   
        st.add(4);
        st.display();     
    }
}
