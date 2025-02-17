class List{

    public static class Node{
        int data;
        Node next;

        Node(int data )
        {
            this.data = data;
            this.next= null;
        }
    }
    static Node  head= null;
    // Node temp= null;

    public   void add(int data)
    {
        Node newNode = new Node(data);
        if( head == null)
        {
            head = newNode;
            return;
        }
        Node temp = head;
        while( temp.next !=  null)
        {
            temp = temp.next;
        }

        temp.next= newNode;
    }

    public  void display()
    {

        if ( head == null )
        {
            System.out.println(" empty list ");
            return;
        }
      Node  temp = head;
        while( temp != null)
        {
            System.out.print(" -> "+ temp.data);
            temp= temp.next;

        }

    }
    
    public void insertfirst(int data )
    {
        Node newNode= new Node(data);
        if( head == null)
        {
head = newNode;
return;
        }
    newNode.next = head;
    head = newNode;

    }

    public void remove() {
    if (head == null) {
        System.out.println("Empty list");
        return;
    }

    if (head.next == null) {  
        System.out.println("\nRemoving: " + head.data);
        head = null;
        return;
    }

    Node temp = head;
    while (temp.next.next != null) { 
        temp = temp.next;
    }

    System.out.println("\nRemoving: " + temp.next.data);
    temp.next = null;  
}

  

  
public void insertpos(int index ,int data)
{
    Node newNode = new Node(data);
    if( index == 0 )
    {
        newNode.next= head;
        head= newNode;
        return;
    }
    Node temp = head;
   int count=1;
   while(count < index  &&  temp.next != null)
   {
    temp = temp.next;
    count++;

   }
   newNode.next = temp.next;
   temp.next = newNode;
    
  


    
}

public void deletepos(int index)
{
    if( index == 0)
    {
        head = head.next;
        return;
    }
    int count =1;
    Node temp = head;
    while(count < index  &&  temp != null)
    {
        temp = temp.next;
        count++;
    }
    if( temp.next.next == null)
     temp.next= null;
    else
     temp.next= temp.next.next ;
     
}
    public static void main(String args[])
{
List n1= new List();

    n1.add(3);
    n1.add(1);
    n1.add(2);


    n1.display();
    System.out.println(" \n After insering first ");

    n1.insertfirst(8);
     n1.display();
    //  n1.add(4);
    n1.remove();
    n1.display();
    System.out.println(" ");

    n1.insertpos(4,11);
    n1.display();
System.out.println();
n1.deletepos(3);
n1.display();

}
}