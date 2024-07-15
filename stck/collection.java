 
 
 import java.util.*;
 class collection
 {
    public static void main(String args[])
    {
Stack<Integer> s= new Stack<Integer>();
s.push(2);
s.push(3);
s.push(4);
while(!s.isEmpty())
{
    System.out.println(s.peek());
        System.out.println(" popped element"+s.pop());
    
}
}
}