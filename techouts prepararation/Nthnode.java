

public class Nthnode {
   static class ListNode {
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

static ListNode  head=null;
public void addNode(int data)
{
    ListNode newnode= new ListNode(data);
    ListNode  temp;
    if(head == null){
        head= newnode;
        return;

    }else{
        temp= head;

        while(temp.next != null)
        {
            temp =temp.next;
        }
        temp.next=newnode;

    }    
}
public void display()
{
    if( head == null){
        System.out.println(" the  list is empty ");
        return;
    }
       ListNode  temp;

    temp = head;
    while(temp != null)
    {
        System.out.println(" "+temp.data);
        temp= temp.next;

    }
}
 public static int  findNthFromEnd(int n) {

    int count=0;
    if(head == null)
    {
        System.out.println(" the  list is empty ");
        return 0;
    }

     ListNode temp = head;
    while(temp != null)
    {
        count++;
        if( count == n)
        {
            return temp.data;
        }
        else{
            temp= temp.next;
        }

    }
    return  0;
                   
            }

    public static void main(String[] args) {
       Nthnode  n= new Nthnode();
      n.addNode(5);
       n.addNode(3);
        n.addNode(2);
         n.addNode(7);
      n.display();
      int a= findNthFromEnd(12);
      if( a == 0 )
      {
         System.out.println("the  element doesnot exist ");
        
      }else
      System.out.println("the 2  th element is "+a);
    }
}