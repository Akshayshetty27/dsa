class Double
{
    static class Node{
        int data;
        Node next;
        Node prev;
     Node(int data)
        {
            this.data =data;
            this.next= null;
            this.prev=null;  
            
        }
    }
    static Node head= null;
    static Node sec= null;
    public static void add(int data)
    {
        Node newNode= new Node(data);

        if( head== null)
        {
        head=newNode;
        head.prev=null;
        }
        else{
            Node temp= head;
            while(temp.next != null )
            {
                temp = temp.next;
            }
            temp.next= newNode;
            temp.next.prev = temp;
        }
    }
public static void display()
{
    if( head == null)
    {
        return;

    }else{
        Node temp= head;
        while( temp!= null)
        {
            System.out.print(" "+temp.data);
        }
    }
}

    public static void main(String args[])
    {
        add(4);
        add(3);
        display();


    }
}