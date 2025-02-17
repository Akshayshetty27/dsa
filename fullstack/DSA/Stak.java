class Stak
{
    static int  top= -1 ;
    static int max= 10;
    int arr[]= new int[max];

    public void push(int data)
    {
        if( top + 1 < max)
        {
            arr[++top] = data;
        }
        else{
            System.out.println("overflow  ");
            return;
        }
    }


    public void pop()
    {
        if( top == -1 )
        {
            System.out.println(" underflow ");
            return;
        }
        else System.out.println(" "+(arr[top--]));
    }
    public void peek()
    {
        if( top == -1)
        {
             System.out.println(" underflow ");
            return;

        }
                else System.out.println(" "+(arr[top]));

        
    }

    public void display()
    {
        if( top == -1 )
        {
          System.out.println(" underflow ");
            return;   
        }

        for( int i=top ; i> -1 ; i--)
        {
System.out.print(" "+ arr[i]);
        }
    }

    public int size()
    {
        if( top== -1 )
        {
            return 0;
        }
        return top + 1;
    }

    public boolean isEmpty()
    {
        if( top == -1)
        {
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
     Stak s= new Stak();
     s.pop();   
     s.push(3);
     s.push(5);
     s.push(7);
     s.push(9);
     s.push(2);
     s.push(4);
      s.peek();
    //  System.out.println();
     s.display();
          s.pop();   
     s.pop();   
     s.pop();   
     s.pop();   

     s.display();

     System.out.println("\n size : "+s.size());
     System.out.println(" is Empty : "+ s.isEmpty());


    
    }
}