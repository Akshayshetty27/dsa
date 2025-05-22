class list
{
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data= data;
            this.next= null;
        }
    }

    static Node head= null;

    public void add(int data)
    {
        Node newNode = new Node(data );

        if( head == null)
        {
            head = newNode ;
            return;
        }
        Node temp= head;
        while(temp.next != null)
        {
            temp= temp.next;
        }
        temp.next = newNode;
        
    }
    public void print()
    {
        if( head == null)
        {
            System.out.println(" the   list is null ");
            return;
        }

        Node temp = head;
        while( temp != null)
        {
            System.out.println(" "+temp.data);
            temp=temp.next;
        }

    }
    public static void main(String args[])
    {
        list l= new list();
        l.add(1);
        l.add(3);
        l.print();
    }
}