class StckOperation {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    public static void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public static void pop() {
        if (head == null) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Popped: " + head.data);
        head = head.next;
    }

    public static void display() {
        if (head == null) {
            System.out.println("Stack is empty.");
            return;
        }
        Node temp = head;
        System.out.print("Stack: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        StckOperation st = new StckOperation();
        st.push(4);
        st.push(3);
        st.push(5);
        st.push(6);
        st.display();    
        st.pop();        
        st.display();    
    }
}
