class Queue
{
    static int max=10;
    static int front=-1;
    static int rear= -1;
    static int arr[]= new int[max];
    static void push(int data)
    {
        if(front == -1 && rear == -1)
    {
        arr[++front]=data;
        return;
    
    }
        arr[++rear]=data;
  
    }

    static void display()
    {
        if(front == -1)
        {
            System.out.println("underflow");
            return;
        }else{
            for(int i=front ; i<=rear ; i++)
            {
                System.out.println(" "+arr[i]);

            }
        }
    }


    static int pop()
    {
        int elem;
        if(front == -1)
        {
            System.out.println("no element to deltee");
            return -1;
        }else{
            elem=arr[front++];
        }
        return elem;
    }
    public static void main(String args[])
    {
        Queue q= new Queue();
        push(5);
        push(7);
         push(5);
          display();
           System.out.println("deletion"+pop());
             System.out.println("deletion"+pop());
               System.out.println("deletion"+pop());
System.out.println("deletion"+pop());
//  display();
         
    }
}