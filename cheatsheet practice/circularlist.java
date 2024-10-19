class  circularlist
{

  static  class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data= data;
            this.next=null;
        }
    }
   static Node head=null;
    // Node temp=null;

   static void create(int data)
   {
    Node newnode= new Node(data);
    if( head == null)
    {
        head=newnode;
        return;
       }
       newnode.next=head;
       head=newnode;
   }
   static void deletefirst()
   {
    if(head == null)
    {
    return;
    }
    head= head.next;

   }

   static void print()
   {
    if( head == null)
    {
        return;
    }
   Node temp= head;
   while(temp!= null)
   {
    System.out.print(" "+temp.data);
    temp=temp.next;
   }   }
    public static void main(String args[])
    {
     circularlist c1= new circularlist();
     c1.create(5);
        c1.create(4);
           c1.create(3);
     c1.print();
     System.out.println(" ");
c1.deletefirst();
     System.out.println(" ");

c1.print();
    }
}