// import java.lang.classfile.components.ClassPrinter;
// import java.util.*;
// import  java.util.*;
class implement{
 Node head= null;
   class Node{
     int data;
     String name;
     Node next;
     Node(String name,int data ){
        this.name=name;
        this.data=data;
        this.next=null;
     }
    }

    public void add(String name,int data)
    {
        Node newnode= new Node(name,data);
        if(head == null)
        {
            head= newnode;
        }
        else{
            Node temp=head;
            while(temp.next != null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
        }

    }

public void print()
{
    if( head == null)
    {
        System.out.println(" no element to print ");
            }
    else{
       Node  temp= head;
    while(temp != null)
    {
        System.out.print(""+temp.name);
        System.out.print("      "+temp.data);
        System.out.println("");
        temp=temp.next;
    }
    }
}

    public static void main(String args[])
{
implement list=new implement();

list.add("India",150);
list.add("china",145);
list.add("nepal", 35);
list.add("USA", 75);
System.out.println(" country  population");
list.print();
}
}