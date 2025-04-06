class LinkedQueue
{

      class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    public   void enQueue(int data)
    {
        Node newNode = new Node(data);
        if( head == null)
        {
            head = newNode;
            return;
        }

        Node temp = head;

while (temp.next != null) {
    temp = temp.next;
}
temp.next = newNode;

    }

    public int  deQueue()
    {
        if( head == null)
        {
            System.out.println(" the queue is empty ");
            return  0;   
    }

    int data= head.data;
    System.out.println(" the deleted item :"+data);

    head= head.next;

    return data;
    }

    public void display()
    {
        if( head == null)
        {
            System.out.println(" the queue is Empty ");
            return ;
        }
    Node temp = head;
    while( temp != null)
    {
        System.out.println(" "+ temp.data);
        temp= temp.next;
    }
    }

public  void top( )
{
    if(head == null )
    {
        System.out.println(" the  queue is Empty ");
        return ;
    }
    System.out.println(" "+ head.data);
}
    public static void  main( String args[])
    {
        LinkedQueue node = new LinkedQueue();
        node.enQueue(1);
        node.enQueue(2);
        node.enQueue(3);
        node.display();
        node.deQueue();
        node.top();
    
    }
}