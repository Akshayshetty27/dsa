class Linkedlist
{
    static Node head=null;
     static class Node
    {
        int data;
        Node next;
       Node(int data )
        {
            this.data=data;
            this.next=null;
        }
    }
  public static void add(int data)
  {
    Node newnode= new Node(data);
    if(head==null)
    {
        head= newnode;
        return;
    }
   Node  temp=head;
    while(temp != null)
    {
        temp=temp.next;

    }
    temp.next=newnode;

  }
public static void display()
{
    if(head== null)
    {
        System.out.println("no elment");
        return;
    }
    Node temp=head;
    while(temp.next != null)
    {
        System.out.println(" "+temp.data);
        temp=temp.next;
    }
}
    public static void main(String args[])
    {
add(4);
add(4);
display();

    }
}