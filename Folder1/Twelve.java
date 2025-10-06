// Queue in  java 

class Twelve
{
    public static class Queue{
        private int max;
        private int front ;
        private int rear ;
        private int[] arr;
        public Queue( int size)
        {
            this.max= size;
            this.arr = new int[max] ;
            this.front = -1;
            this.rear = -1;
        }

        public void enqueue( int val){
            if( rear == max - 1)
            {
                System.out.println(" the Queue is full ");
                return;
            }
            arr[++rear]= val;
            if( front == -1)
            {
                front = 0;
            }

        }

        public void dequeue()
        {
            if( front == -1 || front > rear )
            {
                System.out.println(" the Queue is empty ");
                return;
            }
            front++;
            if( front > rear )
            {
                front = rear = -1; 
            }
        }
        public int peek()
        {
            if( front == -1 || front > rear )
            {
                System.out.println(" the Queue is empty ");
                return -1;  
            }
            return arr[front];
        }       
    

    public void display()
    {
        if ( front == -1 || front > rear )
        {
            System.out.println(" the Queue is empty ");
            return;
        }
        for( int i = front ; i <= rear ; i++ )
        {
            System.out.print(arr[i]+" ");
        }   
        System.out.println();
    }
}
    public static void main (String args[])
    {

        Queue q = new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display(); 
        System.out.println("Front element: " + q.peek());
        q.dequeue();
        q.display(); 
        System.out.println("Front element: " + q.peek()); 
    }
}