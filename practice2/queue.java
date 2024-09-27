class queue
{
// In queue  delete  will create a memory wastage  
// there comes  circular queue
   static  int top=-1;
   static  int front=-1;
   static int  max=5;
   static  int arr[];

    public queue() {
    arr=new int[max];
    }
   
   public void add(int num)
   {
   if(top == -1)
   {
    front++;
    arr[++top]= num;
   }
   else
     arr[++top]= num;
   }

   public void delete()
   {
    if( top ==-1)
    {
        System.out.println("queue is empty");
    }
    front++;
   }
   public void print()
   {
    if(top == -1)
     {
        System.out.println(" the stack is empty ");
        return;
     }
    for(int i= front; i<=top;i++)
     System.out.print(" "+arr[i]);
   }
    public static void main(String args[])
    {
        queue qu=new queue();
qu.print();
        qu.add(4);
        qu.add(5);
        qu.add(1);
        qu.add(9);
        qu.add(7);

        qu.print();

        System.out.println("\ndelete operation");
        qu.delete();
            qu.print();

    }
}