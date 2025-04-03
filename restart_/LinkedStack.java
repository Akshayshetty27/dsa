class LinkedStack {
   class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
static Node head=null;
    public void push(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;     
    }

    public void pop()
    {
        if( head == null)
        {
            System.out.println(" stack is Empty ");
            return;
        }
        if( head.next == null)
        {
    System.out.println(head.data);
    head = null;
return;
 }
        System.out.println(" deleted item "+ head.data);
        head = head.next;
    }

public void display()
{
    if( head == null)
    {
        System.out.println(" stack is Empty ");
        return;
    }
    Node temp = head;
    while( temp != null)
    {
        System.out.println(" "+ temp.data);
        temp= temp.next;
    }
}

public int top()
{
    if( head == null)
    {
        System.out.println("stack is empty ");
        return 0;
    }
    return head.data;
}
    public static void main(String args[])
    {
         LinkedStack  stack= new LinkedStack();
         stack.push(2);
         stack.push(5);
         stack.push(3);
         stack.display();
         stack.pop();
        stack.display();
        stack.pop();

             }
}