class stli 
{
    static int top=-1;
    static int high=5;
    static Node head=null;
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

    public void add(int data)
    {
     if( top== high)
     {
        System.out.println(" the stack is fulll");
        return;
     }
     Node newnode=new  Node(data);
     Node temp;
     if( head == null)
     {
        head=newnode;
        top=1;
     }
     else{
        temp= head;
        head= newnode;
        head.next=temp;
        top+=1;
     }
    }
    
    public void printt()
    {
     if(  top== -1)
     {
        System.out.println(" stack is empty");
        return;
     }
     Node temp= head;
     while( temp != null)
     {
        System.out.println(" "+temp.data);
        temp=temp.next;
     }

    }
    public void delete()
    {
          top-=1;
        if( top == -1)
        {
            System.out.println(" the stack is empty "+ top);
            return;
        }
        head= head.next;
      
    }
     public static void main(String args[])
    {
stli li= new stli();
li.add(5);
li.add(6);
li.add(8);
li.add(7);
li.printt();
li.delete();
System.out.println("after deleteing");
li.printt();
li.delete();
li.delete();
li.delete();
System.out.println("after deleteing");
li.printt();
li.delete();

li.add(5);
li.add(6);
li.add(8);
li.add(7);
li.add(5);
li.add(6);
li.printt();
// li.add(8);
// li.add(7);





    }
}