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

    public static  void enQueue(int data)
    {
        Node newNode = new Node(data);
        if( head == null)
        {
            head = newNode;
            return;
        }

        Node temp = head;

        while( temp != null )
        {
            temp = temp.next;

        }
        temp=  newNode;


    }

    public static int  deQueue()
    {
        if( head == null)
        {
            System.out.println(" the queue is empty ");
            return ;
        

    }
    public static void  main( String args[])
    {


    }
}