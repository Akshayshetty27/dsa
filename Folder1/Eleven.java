//  array based stack in java 
class Eleven
{
    public static class Stack{
        private int max;
        private int top;
        private int[] arr;
        public Stack( int size)
        {
            this.max= size;
            this.arr = new int[max] ;
            this.top = -1;
        }
        public void push( int val){
        if( top == max - 1)
        {
            System.out.println(" the Stack is full ");
            return;
        }

        arr[++top]= val;
    }


    public void pop()
    {
        if( top == -1 )
        {
            System.out.println(" the Stack is empty ");
            return;
        }

        top--;

    }

    public int peek()
    {
        if( top == -1 )
        {
            System.out.println(" the Stack is empty ");
            return -1;  
        }
        return arr[top];
    }

    public void display()
    {
        if ( top == -1 )
        {
            System.out.println(" the Stack is empty ");
            return;
        }
        for( int i = top ; i >= 0 ; i-- )
        {
            System.out.print(arr[i]+" ");
        }   
        System.out.println();
    }
    }

    
    public static void main(String args[])
    {
        Stack s = new Stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60); 
        s.display();
        System.out.println("Top element is: " + s.peek());
        s.pop();
        System.out.println("After popping, top element is: " + s.peek());
        s.display();

    }
}