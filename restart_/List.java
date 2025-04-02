class List {
    static Node head = null;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void node_add(int data) {
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

    public void display() {
        if (head == null) {
            System.out.println("The list is empty");
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
        List myList = new List();

        myList.node_add(3);
        myList.node_add(5);
        myList.node_add(7);

        myList.display(); 
    }
}
