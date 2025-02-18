class Que{
    int max= 10;
    static int front=-1;
    static int rear= -1;
    int arr[]= new int[max];
    public void enque(int data)
    {
        if(rear + 1 == max)
        {
             System.out.println(" overflow ");
             return;
        }
        if(front == -1 && rear == -1 )
        {
            arr[++front  ] = data;
            rear++;
        }
        else {
            
            arr[(++rear)% 10] = data;
        }
    }

    public void deque()
    {
        if( front == -1 )
        {
            System.out.println("underflow");
            return;
        }
        int ele= arr[(front++)% 10];
        if( ele == 0 )
        {
             System.out.println( " underflow ");return;
        }
        System.out.println(" deleted element is :"+ ele);
    }

    public void display()
    {
        if(front == -1 )
        {
            System.out.println(" underflow ");
            return;
        }
        int t=rear;

        for( int i=0; i<=t ;i++){
        System.out.print(" "+arr[i]);
        }
    }

    public static void main(String args[])
    {

        Que q= new Que();
        q.enque(5);
        q.enque(3);

        q.enque(1);
         q.display();
        q.deque();
           q.enque(5);
        q.enque(3);
        q.enque(1);
       

        q.display();    q.enque(5);
        q.enque(3);
        q.enque(1);

   System.out.println();
            q.display();
        q.enque(3);
        q.enque(1);


    }
}