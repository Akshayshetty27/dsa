
// import java.util.Queue;
class Queue
{
    static int front=-1;
    static int rear=-1;
    static int Max=10;
    static int arr[]=new int[Max];

    static void add(int num)
    {
        if( rear + 1  == Max)
        {
System.out.println(" the Queue is full ");
return;
        }   
        
        arr[++rear] = num;
         }

         static void remove()
         {
            if( rear == -1)
             {
                System.out.println(" the Queue is empty  ");
                return ;
             }
             front++;
         }

         static void print()
         {
             if( rear == -1)
             {
                System.out.println(" the Queue is empty  ");
                return;
             }
             int temp= front + 1;
           while(temp <= rear )
           {
            System.out.println(" "+arr[temp]);
            temp++;
           }
         }
    public static void main(String args[]){

// Queue is a FIFO(FIrst In FIrst Out)
Queue q= new Queue();
// q.print();
q.add(3);
q.add(4);
q.add(5);
q.print();
System.out.println(" remmoving");
q.remove();
q.print();


// Queue<Integer> qu = new Queue<Integer>();
// qu.add(4);
    }
}