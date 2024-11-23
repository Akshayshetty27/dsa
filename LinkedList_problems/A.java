class A{

    class Node
    {
        int data;  
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
            
        }
    }
    static Node head= null;
    static Node temp=null;
    static int count=0;
     public void add(int data)
    {
        Node newNode= new Node(data);
        if(head== null)
        {
            head=newNode;
            count++;
            return;
        }
        
        temp=head;
        while(temp.next != null)
        {
            temp=temp.next;

        }
        temp.next=newNode;
        count++;
        
    }

    public void display()
    {
    if( head== null)
    {
        System.out.println(" no elment to display ");
        return;
    }
    temp=head;
    while( temp != null)
    {
        System.out.println(" "+temp.data);
        temp=temp.next;
    }
    }
    public void display_middle()
    {
        temp=head;
        int no=1;
        while( temp!= null)
        {
            if( no == (count+1) /2)
            {
                System.out.println(" the middle element is"+temp.data);
                return;
            }
            no++;
            temp=temp.next;
        }
    }
    public void search(int data)
    {
        if( head == null)
        {
            System.out.println(" no element to Search ");
            return;
        }
        temp=head;
        int no=1;
        while(temp != null)
        {
            if( temp.data == data)
            {
                System.out.println(" the element found "+no);
                return;
            }
            no++;
            temp=temp.next;

        }
        System.out.println(" element not found ");
    }
    public static void main(String args[])
    {
        A node=new A();
        node.add(4);
        node.add(5);
        node.add(6);
        System.out.println(" "+count);
        System.out.println(" the list elements are ");
        node.display();
        node.display_middle();
        node.search(5);

    }
}