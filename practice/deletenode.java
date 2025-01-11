class deletenode{
    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
        }

        static Node head=null;

   
        static void add(int data)
        {
        Node newnode=new  Node(data);
       if(head == null)
            {
             head = newnode;
             return;
            }
            Node temp= head;

            while(temp.next != null)
            {
                temp=temp.next;
            }
            temp.next=newnode;        

    }

    static void deleteOnGreaternumber()
    {
     if( head == null)
     {
        return ;
     }   
     Node temp = head;
     while( temp.next  != null )
     {
        if (temp.data < temp.next.data)
        {
            System.out.println(temp.next.data);
            temp.next=temp.next.next;
        }
        temp=temp.next;
     }
    }

static void delete()
{
    if( head == null)
     {
        System.out.println(" no element ");
        return;
     }   

     Node temp = head;
     while(temp.next != null)
     {
temp= temp.next;
     }

     temp=null;

}

static void display()
{
    if( head == null)
    {
        return ;
    }
    Node temp= head;
    while(temp != null)
     {
        System.out.println(" "+temp.data);
temp= temp.next;
     }
}
    
public static void main(String args[]){
 deletenode list = new deletenode();
//  list.delete();
 list.add(4);
  list.add(5);
   list.add(7); 
   list.add(8); 
   list.add(3); 
   list.add(2);
    list.display();
    System.out.println(" after");
   list.deleteOnGreaternumber();
 list.display();
    }
}