// import jav.util.LinkedList;
// import java.util.Scanner;
class list{
Node head;
private int size;
class Node{
    String data;
    Node next;
    Node(String data)
    {
        size+=1;
        this.data=data;
        this.next=null;
    }
}


//   add first || add last 
public void addfirst(String data)
{
    Node newNode= new Node(data);
    if(head == null)
    {
        head=newNode;
        return;

    }
    newNode.next=head;
    head=newNode;
}

//  adding element at the last 
public void addlast(String data)
{
 Node newNode=new Node(data);
 if(head== null)
 {
    head=newNode;
    return;
 }
 Node currentnode= head;
 while(currentnode.next !=null)
 {
    currentnode=currentnode.next;
 }
 currentnode.next=newNode;
}


//  printing the list element 
public void printlist()
{
    
    if(head == null)
    {
        System.out.println(" the list is empty");
        return  ;
          }
    Node currentnode=head;
    while(currentnode != null)
    {
        System.out.print(currentnode.data+" -> ");
        currentnode=currentnode.next;
    }
    System.out.print("null");
    }

    //  deleting a node 
    public void deletenode( String n)
    {
        if(head == null)
        {
             System.out.print(" the list is empty");
             return;
        }
        Node currentnode= head;
        while(currentnode != null)
        {
            if(currentnode.data == "n")
            {
                currentnode=currentnode.next;
                return;
            }
            else
             currentnode=currentnode.next;
        }
    }

 
 public void deletefirst()
 {
    if(head == null)
    {
        System.out.print(" the list is empty");
        return;
    }
    head=head.next;
 }
 public void deletelast()
 {
    
    if(head == null)
    {
        System.out.print(" the list is empty");
        return;
    }
    Node seclast=head;
    Node last=head.next;
    while(last.next != null)
    {
        last=last.next;
        seclast=seclast.next;

    }
    seclast.next=null;
 }



 public void reverselist()
 {
    if(head==null || head.next== null)
    {
        return;
    }
    Node previus=head;
    Node currentnode=head.next;
    while(currentnode!= null)
{
    Node nextNode=currentnode.next;
    currentnode.next=previus;
    previus=currentnode;
    currentnode=nextNode;

}
head.next=null;
head=previus;
 }



 public Node reverselistrecursion( Node head)
 {
if(head==null || head.next == null)
{
    return head;
}
Node newHead=reverselistrecursion(head.next);
head.next.next=head;
head.next=null;
return newHead;

 }
    public static void main(String args[])
    {

list ll=new list();
System.out.println(" insertion of element");
ll.addfirst("b");
ll.addfirst("a");
ll.addlast("c");
ll.printlist();
System.out.println();
System.out.println(" reverse of list  element");
ll.reverselist();
ll.printlist();
System.out.println();
System.out.println(" reverse of list  element using recursion");
ll.head=ll.reverselistrecursion(ll.head);
ll.printlist();
System.out.println();
System.out.println(" delete of list  element");
ll.deletefirst();
System.out.println();
ll.printlist();
ll.deletelast();
System.out.println();
ll.printlist();
    }
}