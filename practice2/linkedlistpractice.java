


class linkedlistpractice{
    private Node head = null;
     private Node temp = null;
    private class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public void add(int data)
    {
        Node newnode=new Node(data);
        if(head == null)
         head=newnode;
        else{
            temp=head;
            while(temp.next != null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
       
    }
    public void print()
    {
        if(head== null)
        {
         System.out.print(" no element to delete ");
        }
        else{
            temp=head;
            while(temp != null){
            
            System.out.println(" "+temp.data);
            temp=temp.next;
            }
        }
    }
    public  void deletefirst()
    {
        if(head ==null)
         System.out.println(" there is no elment in the list");
        else{
            head=head.next;
        }
    }
    public void delete_by_element(int num)
    {
        if(head== null)
            System.out.print(" no elment");
        else{
            temp=head;
            while(temp !=null)
            {
                if(temp.data == num)
                {
                    temp= null;

                }
                else{
                    temp=temp.next;
                }
            }
        }
    }
    public static void main(String args[])
    {
linkedlistpractice list= new linkedlistpractice();
list.add(4);
list.add(6);
list.add(5);
list.print();  
list.deletefirst();
System.out.println(" after deleteing   ");
 list.print(); 
 list.add(4);
 list.deletefirst();list.print(); System.out.println(" after deleteing   ");
list.deletefirst();list.print(); System.out.println(" after deleteing   ");
 list.deletefirst();
 list.print(); 

    }
}