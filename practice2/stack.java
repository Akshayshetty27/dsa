

class stack
{
    static int top;
    static int arr[];
    static int maxsize;

  public  stack(int size)
   {
    maxsize= size;
    arr=new int [maxsize];
    top=-1;
   }    

   public  void push(int num)
   {
     if(top == maxsize -1)
     {
        System.out.println("Stack overflow ");
        return ;
     }
     arr[++top]=num;
   }
   public void print()
   {
    for(int i=0;i<=top;i++)
     System.out.println(arr[i]);

   }
   public void pop()
   {
    if(top== -1)
     {
        System.out.println("stack is empty");
        return;
     }
     top=top-1;
   
   }
   public static void main(String[] args) {
      


stack ar=new stack(5);
     ar.pop();
  ar.push(4);
 ar.push(2);
  ar.push(3); 
 ar.push(5);

 ar.print();
 System.out.println("pop operation ");
 ar.pop();
 ar.print();

 ar.push(21);
  ar.print();
   ar.push(25);
    ar.push(5);

 ar.print();

    }
}