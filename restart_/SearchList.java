class SearchList
{
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

static Node head = null;
     public void push(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;     
    }


        public void pop()
    {
        if( head == null)
        {
            System.out.println(" stack is Empty ");
            return;
        }
        if( head.next == null)
        {
    System.out.println(head.data);
    head = null;
return;
 }
        System.out.println(" deleted item "+ head.data);
        head = head.next;
    }


    public void search( int data)
    {
        if( head == null)
        {
            System.out.println(" the list is empty ");
            return;

        }

         Node temp = head;
         while( temp != null)
         {
            if( temp.data == data )
            {
                System.out.println(" the "+ data + " found ");
                return;
            }
            temp= temp.next;

         }
    }



    public static void main(String args[])
    {
        SearchList list = new SearchList();
        list.push(3);
        list.push(2);
        list.push(1);
        list.push(8);

        list.search(3);
        list.search(1);

    }
}