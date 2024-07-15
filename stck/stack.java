import java.util.*;
class stack
{
    static int top=-1;
    static int n=5;
    static int arr[]=new int[n];
    public void push(int number)
    {
if(top == n-1)
{
    System.out.println(" stack is full");
    return;
}else
{
    arr[top++]=number;
    System.out.println("numbser inserted");
    return;
}
    }
    public static void main(String args[])
    {
//  stack works on FILO--> First In Out First Out 
//  operation --> insertion(push) , deletion(pop) ,peek() 
stack st= new stack();
st.push(1);
    }
}