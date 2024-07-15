
// class stckll
// {
//     //  Node Declaration
//  static  class Node
//  {
// int data;
// Node next;
// public Node(int data)
// {
//     this.data=data;
//     this.next=null;
// }
//  }
//  static class Stack
// {

// public static Node head;

// public static boolean isempty()
// {
//     return head==null;
// }

// public static void push(int data)
// {
//     Node newnode=new Node(data);
//     if(isempty())
//     {
// head=newnode;
// return;
    
//     }
//         newnode.next=head;
//         head=newnode;
// }

// public static int pop()
// {
//     if(isempty())
//     {
//         System.out.println(" stack is empty");
//         return -1;
//     }
//     int top=head.data;
//     head=head.next;
//     return top;
// }

// public static int peek()
// {
//      if(isempty())
//     {
//         return -1;
//     }
//     return head.data;
// }
// }   



//  public static void main(String args[])
//     {

// Stack s=new Stack();
// s.push(2);
// s.push(3);
// s.push(4);
// while(s.isempty())
// {
//     System.out.println(s.peek());
//         System.out.println(s.pop());
    
// }
// }
// }



class stckll {
    // Node Declaration
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        private Node head;

        public boolean isEmpty() {
            return head == null;
        }

        public void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(2);
        s.push(3);
        s.push(4);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            System.out.println(s.pop());
        }
    }
}