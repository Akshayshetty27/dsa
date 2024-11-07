import java.util.Stack;
class stack 
{
    static int top=-1;
    static int max=5;
    static int arr[]=new int[max];
    static int pop()
    {
      if(top == -1)
      {
        System.out.println(" it is an empty ");
        return 0;
      }
      int num=arr[top];
      top--;
      return num;
    }
    static void push(int num)
    {
        if( (top + 1) == max)
        {
            System.out.println("the stack is full");
            return;
        }
        arr[++top]= num;

    }
    static void printt()
    {
       int temp=top;
       while( temp!=-1)
       {
        System.out.println(" "+arr[temp]);
        temp--;
       }
    }
    public static void main (String args[])
    {
        /// stack is LIFO (Last In First Out ) structure or FILO (First In Last Out ) structur
        int a[]= new int[5];
        stack c= new stack();
        System.out.println("Insertion ");
        c.push(5);
        c.push(3);
        c.push(7);
        c.printt();
      System.out.println(" Deletion "+c.pop());
        c.push(2);
        // c.push(1);
        c.printt();

System.out.println(" using inbuilt method Stack");
        // using inbuilt method 
        Stack<Integer> stack= new Stack<>();
        stack.push(5);
          stack.push(7);
        System.out.println(""+stack.pop());
        stack.push(3);
        System.out.println(""+stack.pop());
        }
}